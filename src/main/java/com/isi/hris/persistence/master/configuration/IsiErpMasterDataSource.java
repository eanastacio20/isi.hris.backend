package com.isi.hris.persistence.master.configuration;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.isi.hris.configurations.ISIHrisApplicationProperties;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory", basePackages = "com.isi.hris.persistence.master", transactionManagerRef = "transactionManager")
public class IsiErpMasterDataSource {
	
	@Autowired
	ISIHrisApplicationProperties appProperties;

	@Primary
	@Bean(name = "entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource());
		em.setPackagesToScan(new String[] { "com.isi.hris.persistence.master" });

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		HashMap<String, Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", "validate");
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		properties.put("spring.jpa.hibernate.naming.physical-strategy", "org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl");
		em.setJpaPropertyMap(properties);
		em.setPersistenceUnitName("ErpMaster");
		return em;
	}

	@Primary
	@Bean(name = "dataSource")
	public DataSource dataSource() {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl(appProperties.getMasterDatasourceUrl());
		config.setUsername(appProperties.getMasterDatasourceUsername());
		config.setPassword(appProperties.getCompanyDatasourcePassword());
		config.setDriverClassName(appProperties.getCompanyDatasourceDriverClassName());
		HikariDataSource ds = new HikariDataSource(config);
		return ds;

	}

	@Primary
	@Bean(name = "transactionManager")
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return transactionManager;
	}
}
