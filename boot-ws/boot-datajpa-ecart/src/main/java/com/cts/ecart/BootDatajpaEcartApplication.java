package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.repository.ProductRepository;

@SpringBootApplication
public class BootDatajpaEcartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(BootDatajpaEcartApplication.class, args);
		ProductRepository prodRepo = ac.getBean(ProductRepository.class);
		prodRepo.findAll().forEach(System.out::println);
	
	}

}
