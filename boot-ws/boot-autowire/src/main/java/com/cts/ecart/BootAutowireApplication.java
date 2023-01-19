package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.entity.Product;
import com.cts.ecart.repository.ProductMySQLRepositoryImpl;
import com.cts.ecart.service.ProductService;
import com.cts.ecart.service.ProductServiceImpl;

@SpringBootApplication
public class BootAutowireApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ac= SpringApplication.run(BootAutowireApplication.class, args);
		//ProductRepositoryImpl prodRepo = ac.getBean(ProductRepositoryImpl.class);
		ProductService ps = ac.getBean(ProductService.class);
		
		Product p1=new Product();
		
		ps.saveProduct();
						
		
		
		//prodRepo.save();
	}

}
