package com.cts.ecart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cts.ecart.entity.Category;
import com.cts.ecart.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	// DSL
	
	// find all products whose price is less than 5000?
	
	List<Product> findByPriceInfoPriceGreaterThanEqual(double price);
	
	/* ? means positional paerameters
	@Query(name = "q1",value = "from com.cts.ecart.entity.Product p where p.priceInfo.price>=?1")
	List<Product> filterByPrice(double price);
	*/
	
	/*
	// by named parameters (:)
	@Query(name = "q1",value = "from com.cts.ecart.entity.Product p where p.priceInfo.price>=:price")
	List<Product> filterByPrice(double price);
	*/
	
	@Query(name = "q1",value = "from com.cts.ecart.entity.Product p where p.priceInfo.price>=:lowPrice")
	List<Product> filterByPrice(@Param("lowPrice") double price);
	
	@Query(name="q2",value="from com.cts.ecart.entity.Product as p where p.priceInfo.price>=:start and p.priceInfo.price<=:end")
	List<Product> filterPriceRange(double start,double end);
	
	

}
