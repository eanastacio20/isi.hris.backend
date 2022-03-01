package com.isi.hris.persistence.company.configuration;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableJpaRepositories(basePackages = "com.isi.hris.persistence.company", transactionManagerRef = "companyTransactionManager", entityManagerFactoryRef = "companyEntityManager")
@EnableTransactionManagement
@RequiredArgsConstructor
@DependsOn("dataSourceRouting")
public class ISIErpCompanyDataSource {

	@Autowired
	DataSourceRouting dataSourceRouting;

	@Bean(name = "companyEntityManager")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder builder) {
		HashMap<String, Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", "validate");
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		properties.put("spring.jpa.hibernate.naming.physical-strategy", "org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl");
		return builder.dataSource(dataSourceRouting)
				.packages("com.isi.hris.persistence.company")
				.persistenceUnit("ErpCompany")
				.properties(properties)
				.build();
	}

	@Bean(name = "companyTransactionManager")
	public JpaTransactionManager transactionManager(
			@Autowired @Qualifier("companyEntityManager") LocalContainerEntityManagerFactoryBean entityManagerFactoryBean) {
		return new JpaTransactionManager(entityManagerFactoryBean.getObject());
	}
}
