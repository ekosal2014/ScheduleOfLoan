package com.java.loan.configuration.mybatis;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "com.java.loan.mapper")
public class LoanMybatis {
	
	@Bean (name = "dataSource")
	public DataSource dataSource(){
	       DriverManagerDataSource dataSource = new DriverManagerDataSource();
	       dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	       dataSource.setUrl("jdbc:mysql://localhost:3306/scheduleofloan");
	       dataSource.setUsername("root");
	       dataSource.setPassword("");
	       return dataSource;
	}
	
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource());
		sqlSessionFactory.setTypeAliasesPackage("com.java.loan.model");
		return sqlSessionFactory;
		
	}
	
	
}
