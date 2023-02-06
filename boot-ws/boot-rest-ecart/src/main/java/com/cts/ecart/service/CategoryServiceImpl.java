package com.cts.ecart.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ecart.entity.Brand;
import com.cts.ecart.entity.Category;
import com.cts.ecart.repository.BrandRepository;
import com.cts.ecart.repository.CategoryRepository;
@Service
public class CategoryServiceImpl {
	
	@Autowired
	private CategoryRepository catRepo;
	@Autowired
	private BrandRepository brandRepo;
	
	public List<Category> getCategories(){
		return catRepo.findAll();
	}
	
	
	public Category findById(int categoryId) {
		return catRepo.findById(categoryId).orElse(null);
	}
	
	public List<Brand> getBrands(int categoryId){

		Category category = catRepo.findAll().stream().filter(cat->cat.getCategoryId()==categoryId).findFirst().orElse(null);
		return category.getBrands();
		
		
	}
	
	

}
