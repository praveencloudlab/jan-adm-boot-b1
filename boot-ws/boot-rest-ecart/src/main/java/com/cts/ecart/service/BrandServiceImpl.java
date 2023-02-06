package com.cts.ecart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ecart.entity.Brand;
import com.cts.ecart.entity.Product;
import com.cts.ecart.repository.BrandRepository;

@Service
public class BrandServiceImpl {
	
	@Autowired
	private BrandRepository brandRepo;

	
	public Brand save(Brand brand,Product prod) {
		System.out.println(">>>>>> Brand::: "+brand);
		Brand brandObj = brandRepo.findById(brand.getBrandId()).orElse(null);
		brandObj.getProducts().add(prod);
		brandRepo.save(brandObj);
		return brandObj;
	}
	
	public List<Brand> findAllBrands(){
		return brandRepo.findAll();
	}
	
	public Brand findById(int brandId) {
		return brandRepo.findById(brandId).orElse(null);
	}
	
}
