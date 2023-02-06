package com.cts.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cts.ecart.entity.Brand;
import com.cts.ecart.entity.Category;
import com.cts.ecart.entity.Product;
import com.cts.ecart.service.BrandServiceImpl;
import com.cts.ecart.service.CategoryServiceImpl;
import com.cts.ecart.service.ProductServiceImpl;



@Controller
public class ProductController {
	
	 
	
	@Autowired
	private CategoryServiceImpl csi;
	@Autowired
	private ProductServiceImpl psi;
	@Autowired
	private BrandServiceImpl bsi;
	@RequestMapping(value = "/")
	
	public String welcome() {
		return "index";
	}

	
	@RequestMapping("/loadAllProducts")
	public String displayAllProducts(Model model) {
		
		List<Product> products = psi.findAll();
		model.addAttribute("prods", products);
		
		return "products";
	}
	
	@RequestMapping(value = "/saveV2")
	public String saveEmployeeV2(@ModelAttribute Product prod,@ModelAttribute Brand brand,@ModelAttribute Category category) {
		// read data from form
		
	   psi.save(prod);
	   
	   bsi.save(brand, prod); // ?	
	   
	   System.out.println(brand);
	   System.out.println(prod);
		return "index";
	}
	

	
	@RequestMapping(value = "/loadFormV1")
	public String loadFormV1(Model model,@ModelAttribute Product product) {
		
		model.addAttribute("categories",csi.getCategories() );
		model.addAttribute("product",product);
		
		return "product-form2";
	}
	
	
	
	
	@GetMapping(value = "/loadCategories")
	@ResponseBody
	public List<Brand> loadStoreNames(@RequestParam int categoryId) {
		return csi.getBrands(categoryId);
	}
	

	
	
	
	
	

}
