package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.repository.ProductRepositoryImpl;

@SpringBootApplication
public class BootJdbcTemplateApplication {
	
	/*
	 *  Data sources in Spring data
	 *  ================================
	 *  1.Hikari CP
	 *  2.Tomcat
	 *  3.Generic
	 *  4.OracleUcp
	 *  5.Dbcp2
	 *  
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		 ConfigurableApplicationContext ac= SpringApplication.run(BootJdbcTemplateApplication.class, args);
		 ProductRepositoryImpl prodRepo = ac.getBean(ProductRepositoryImpl.class);
		 
		 prodRepo.test().forEach(System.out::println);
	
	}

}
