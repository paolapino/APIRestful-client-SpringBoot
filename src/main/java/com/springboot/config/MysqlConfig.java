package com.springboot.config;

import javax.activation.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
/*@PropertySource({"classpath:persistence-multiple-db-boot.properties"})
@EnableJpaRepositories (
	entityManagerFactoryRef = "clientEntityManagerFactory", 
	transactionManagerRef = "clientTransactionManager",
	basePackages = "com.springboot.mysql.repository;")*/

public class MysqlConfig {
/*
	@Primary
	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource clientDatasource() {
		return (DataSource) DataSourceBuilder.create().build();
    }*/
}
