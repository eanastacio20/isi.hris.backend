package com.isi.hris.persistence.company.configuration;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

import com.isi.hris.configurations.ISIHrisApplicationProperties;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class DataSourceRouting extends AbstractRoutingDataSource {

	private static Map<Object, Object> dataSourceMap = new HashMap<>();

	private ISIHrisApplicationProperties appProperties;
	private DataSourceContextHolder dataSourceContextHolder;

	private String selectedCompany;

	@Autowired
	public DataSourceRouting(ISIHrisApplicationProperties appProperties,
			DataSourceContextHolder dataSourceContextHolder) {
		this.dataSourceContextHolder = dataSourceContextHolder;
		this.appProperties = appProperties;
		String dbName = appProperties.getCompanyDatasourceUrl()
				.substring(appProperties.getCompanyDatasourceUrl().lastIndexOf("/") + 1);
		setSelectedCompany(dbName);
		switchDb(dbName, appProperties.getCompanyDatasourceUrl(), appProperties.getCompanyDatasourceUsername(),
				appProperties.getCompanyDatasourcePassword(), appProperties.getCompanyDatasourceDriverClassName());
	}

	@Override
	protected Object determineCurrentLookupKey() {
		return dataSourceContextHolder.getBranchContext();
	}

	@Override
	protected DataSource determineTargetDataSource() {
		HikariDataSource ds = (HikariDataSource) dataSourceMap.get(getSelectedCompany());
		if (dataSourceMap.containsKey(getSelectedCompany())) {
			ds = (HikariDataSource) dataSourceMap.get(getSelectedCompany());
		}
		return ds;
	}

	public void switchDb(String companyId, String jdbcUrl, String username, String password, String driverClassName) {
		HikariDataSource ds = null;
		if (dataSourceMap.containsKey(companyId)) {
			ds = (HikariDataSource) dataSourceMap.get(companyId);
		} else {
			ds = createCompanyDataSource(jdbcUrl, username, password, driverClassName);
			dataSourceMap.put(companyId, ds);
		}
		this.setTargetDataSources(dataSourceMap);
		this.setDefaultTargetDataSource(ds);
	}

	private HikariDataSource createCompanyDataSource(String jdbcUrl, String username, String password,
			String driverClassName) {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl(jdbcUrl);
		config.setUsername(username);
		config.setPassword(password);
		config.setDriverClassName(driverClassName);
		HikariDataSource ds = new HikariDataSource(config);
		return ds;
	}

}
