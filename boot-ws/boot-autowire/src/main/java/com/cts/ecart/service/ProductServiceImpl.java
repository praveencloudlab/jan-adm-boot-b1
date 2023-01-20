package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import com.cts.ecart.repository.ProductRepository;

@Service
//@Configuration
@Lazy(value = false)
public class ProductServiceImpl implements ProductService {
	
	@Async
	public void test() {
		System.out.println("--  Test");
	}
	
	public ProductServiceImpl() {
		System.out.println(">> ProductServiceImpl class object is created..");
	}

	@Autowired
	//@Qualifier(value = "ProductOracleRepositoryImpl")
	private ProductRepository  productRepository;
	
	
	@Override
	public void saveProduct() {
		System.out.println(">> ProductServiceImpl:: saveProduct");
		productRepository.save();
	}
	
}
