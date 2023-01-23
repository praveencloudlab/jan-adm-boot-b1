package com.cts.ecart;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.ansi.AnsiPropertySource;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.model.Product;
import com.cts.ecart.repository.ProductLamdbaRepositoryImpl;
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
		 ProductLamdbaRepositoryImpl dao = ac.getBean(ProductLamdbaRepositoryImpl.class);
		 //single row operations
		 //Map<String, Object> prodRow = prodRepo.genericSingleRowFetch(1);
		 //System.out.println(prodRow);
		 //single row generic operation
		 //prodRepo.genericMultiRowFetch().forEach(System.out::println);
		 
		// prodRepo.findAllByRowMapper().forEach(System.out::println);
		 
		 //Product product = prodRepo.findOneByRowMapper(1);
		 //System.out.println(product);
		 
		 //prodRepo.findAllByResultSetExtractor().forEach(System.out::println);
		// Product product = prodRepo.findOneByResultSetExtractor(1);
		// System.out.println(product);
		 
		 //dao.findAllByFilter(10000).forEach(System.out::println);
		// Product product = dao.findById(1);
		 //System.out.println(product);
		 
		 
		 //dao.findAllV1().forEach(System.out::println);
		 //Product prod = dao.findByIdV1(1);
		 //System.out.println(prod);
		 
		 dao.save(new Product(102,"New_Product1",1213.79));
		 
		 
	}

}
