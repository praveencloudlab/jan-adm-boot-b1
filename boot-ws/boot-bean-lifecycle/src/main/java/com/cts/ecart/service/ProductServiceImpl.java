package com.cts.ecart.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
@Lazy(value = true)
public class ProductServiceImpl {
	
	@Bean
	public void config() {
		System.out.println("ProductServiceImpl:: config on "+System.identityHashCode(this));
	}
	
	@Bean
	public void dataSource() {
		System.out.println("ProductServiceImpl:: dataSource on "+System.identityHashCode(this));
	}
	
	 
	 public ProductServiceImpl() {
		System.out.println("ProductServiceImpl class object created on "+System.identityHashCode(this));
	}
	
	public void deleteProduct(int productId) {
		System.out.println("ProductServiceImpl:: deleteProduct on"+System.identityHashCode(this));
	}

}
