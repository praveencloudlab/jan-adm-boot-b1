package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cts.ecart.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	//@Qualifier(value = "ProductOracleRepositoryImpl")
	private ProductRepository  productRepository;
	
	
	@Override
	public void saveProduct() {
		System.out.println(">> ProductServiceImpl:: saveProduct");
		productRepository.save();
	}
	
}
