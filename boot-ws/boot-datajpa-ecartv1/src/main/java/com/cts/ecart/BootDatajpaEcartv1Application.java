package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.entity.Category;
import com.cts.ecart.repository.CategoryRepository;
import com.cts.ecart.repository.ProductRepository;

@SpringBootApplication
public class BootDatajpaEcartv1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(BootDatajpaEcartv1Application.class, args);
		CategoryRepository catRepo = ac.getBean(CategoryRepository.class);
		ProductRepository prodRepo = ac.getBean(ProductRepository.class);
		//Category category = catRepo.findByCategoryTitle("laptops");
		//System.out.println(category);
		
		//prodRepo.findByPriceInfoPriceGreaterThanEqual(80000).forEach(System.out::println);
		
		//prodRepo.filterByPrice(90000).forEach(System.out::println);
		
		prodRepo.filterPriceRange(55000, 120000).forEach(System.out::println);
		
		// display brand name of a given product ID
		
		
		
		
	
	}
	

}
