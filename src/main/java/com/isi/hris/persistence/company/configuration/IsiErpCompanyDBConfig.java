package com.isi.hris.persistence.company.configuration;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "companyEntityManagerFactory", basePackages = "com.isi.hris.persistence.company", transactionManagerRef = "companyTransactionManager")
public class IsiErpCompanyDBConfig {

	@Autowired
	private Environment env;

	@Bean(name = "companyEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean companyEntityManagerFactory() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(env.getProperty("spring.company.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.company.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.company.datasource.password"));
		dataSource.setDriverClassName(env.getProperty("spring.company.datasource.driver-class-name"));
		em.setDataSource(dataSource);
		em.setPackagesToScan(new String[] { "com.isi.hris.persistence.company" });

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		HashMap<String, Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
		properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
		properties.put("spring.jpa.hibernate.naming.physical-strategy", env.getProperty("org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl"));
		em.setJpaPropertyMap(properties);
		em.setPersistenceUnitName("ErpCompany");
		return em;
	}

	@Bean(name = "companyTransactionManager")
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(companyEntityManagerFactory().getObject());
		return transactionManager;
	}
}
