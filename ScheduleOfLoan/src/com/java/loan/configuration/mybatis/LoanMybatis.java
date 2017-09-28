package com.java.loan.configuration.mybatis;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "com.java.loan.mapper")
public class LoanMybatis {
	
	 @Autowired
	    private ApplicationContext applicationContext;
	 
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
	public SqlSessionFactoryBean sqlSessionFactory() throws IOException {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource());
		/*sqlSessionFactory.setTypeAliasesPackage("com.java.loan.model");*/
		sqlSessionFactory.setMapperLocations(applicationContext.getResources("classpath:META-INF/mybatis/mappers/**/*.xml"));

	        //TODO: TO SOVLE WITH DON'T KNOW THE PROPERTY MAPPING WITH NULL VALUE
	       
		return sqlSessionFactory;
		
	}
	
	
}
