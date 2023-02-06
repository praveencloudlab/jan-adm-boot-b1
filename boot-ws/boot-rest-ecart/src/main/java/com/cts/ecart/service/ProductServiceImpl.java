package com.cts.ecart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ecart.entity.Product;
import com.cts.ecart.repository.ProductRepository;

@Service
public class ProductServiceImpl {

	@Autowired
	private ProductRepository prodRepo;

	public Product save(Product product) {
		return prodRepo.save(product);
	}

	public List<Product> findAll() {
		return prodRepo.findAll();
	}

	public Product findById(int id) {
		return prodRepo.findById(id).orElse(null);
	}

	public Product updateProduct(Product newObj) {
		Product prod = prodRepo.findById(newObj.getProductId()).orElse(null);

		if (prod != null) {
			return prodRepo.save(newObj);
		}
		return null;

	}
	
	
	public void deleteById(int productId) {
		prodRepo.deleteById(productId);
	}
	
	
	
	
	

}
