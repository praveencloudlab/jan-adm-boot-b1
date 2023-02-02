package com.cts.ecart.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cts.ecart.model.Brand;
import com.cts.ecart.model.Category;

@Service
public class StoreServiceImpl {
	
	
	
	private List<Category> categories = Arrays.asList(
            new Category(1, "Laptops"),
            new Category(2, "Mobiles"),
            new Category(3, "Cloths")
    );

    private List<Brand> states = Arrays.asList(
            new Brand(1, "Dell", 1),
            new Brand(2, "Apple Macbook Pro", 1),
            new Brand(3, "Samsung", 2),
            new Brand(4, "One Plus", 2),
            new Brand(5, "LP", 3),
            new Brand(6, "Tom", 3)
    );

    public List<Category> getCategories() {
        return categories;
    }

    public List<Brand> getBrands(int categoryId) {
        return states.stream()
                .filter(brand -> brand.getCategoryId() == categoryId)
                .collect(Collectors.toList());
    }

}
