package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.ecart.service.ProductServiceImpl;

@SpringBootApplication // (container)
public class SpringbootCoreV1Application {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(SpringbootCoreV1Application.class, args);
		 ProductServiceImpl ps1 = ac.getBean(ProductServiceImpl.class);
		 ProductServiceImpl ps2 = ac.getBean(ProductServiceImpl.class);
		ps1.deleteProduct(87);
		ps2.deleteProduct(54);
	}

}
