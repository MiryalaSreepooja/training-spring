package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class ProjectDemoBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectDemoBankApplication.class, args);
	}
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/demobankdb");
		ds.setUsername("root");
		ds.setPassword("password");
		return ds;

	}
}
