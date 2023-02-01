package com.cts.ecart.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.ecart.model.Product;

@Controller
public class ProductController {
	
	

	List<String> storeLocations=Arrays.asList("Chennai","Hyderabad","Bangalore","Pune","Delhi","Mumbai");
	
	@RequestMapping(value = "/")
	public String welcome() {
		return "index";
	}
	
	
	// read data from form
	
	@RequestMapping(value = "/save")
	public String saveEmployee(@RequestParam int id ,@RequestParam String name,@RequestParam double price,@RequestParam String description) {
		// read data from form
		System.out.println(">>>> saving ....."+id);
		System.out.println(name+" "+price+" "+description);
		return "index";
	}
	
	@RequestMapping(value = "/saveV1")
	public String saveEmployeeV1(@ModelAttribute Product prod) {
		// read data from form
		
		System.out.println(prod.getId());
		System.out.println(prod.getName());
		System.out.println(prod.getPrice());
		System.out.println(prod.getDescription());
		
		
		return "index";
	}
	
	@RequestMapping(value = "/saveV2")
	public String saveEmployeeV2(@ModelAttribute Product prod) {
		// read data from form
		
		System.out.println(prod.getId());
		System.out.println(prod.getName());
		System.out.println(prod.getPrice());
		System.out.println(prod.getDescription());
		System.out.println(prod.getStoreInfo().getStoreName());
		System.out.println(prod.getStoreInfo().getLocation());
		System.out.println(prod.getStoreInfo().getProductBrad());
		System.out.println(prod.getStoreInfo().getCategoryName());
		
		
		return "index";
	}
	
	@RequestMapping(value = "/loadFormV1")
	public String loadFormV1(Model model,@ModelAttribute Product product) {
		String[] locations= {"A","B","C"};
		model.addAttribute("locations",storeLocations );
		product.setName("Laptop");
		model.addAttribute("product", product);
		
		return "product-form2";
	}
	
	@RequestMapping(value = "/loadStoreNames")
	public String loadStoreNames(@ModelAttribute Product product,Model model) {
		System.out.println("... loading stores...");
		model.addAttribute("locations",storeLocations );
		//System.out.println("Selected location:: "+product.getStoreInfo().getLocation());
		System.out.println(product);
		return "product-form2";
	}
	
	
	// using Model interface
	@RequestMapping(value = "s1")
	public String loadForm(Model model) {
		System.out.println("f1 method of ProductController");
		model.addAttribute("userName", "Praveen");
		
		return "product-form"; // one is view name
	}
	
	
	
	// using ModelAndView class
	
	@RequestMapping(value = "s2")
	public ModelAndView f2() {
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("two");
		mav.addObject("name", "James");
		mav.addObject("city", "Hyderabad");
		
		return mav;
	}
	
	
	// using ModelMap
	
	@RequestMapping("/s3")
	public String f3(ModelMap map) {
		map.put("person", "Ruth");
		return "three";
	}
	
	
	

}
