package com.cts.ecart.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cts.ecart.model.Brand;
import com.cts.ecart.model.Product;
import com.cts.ecart.service.StoreServiceImpl;

@Controller
public class ProductController {
	
	 
	
	@Autowired
	private StoreServiceImpl ssi;
		
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
		
		System.out.println(prod);
		
		return "index";
	}
	
	@RequestMapping(value = "/saveV2")
	public String saveEmployeeV2(@ModelAttribute Product prod) {
		// read data from form
		
		System.out.println(prod);
		System.out.println("===============================");
		System.out.println(prod.getBrand().getBrandTitle());
		System.out.println(prod.getCategory().getCategoryTitle());
		System.out.println(prod.getStockInfo().getStock());
		System.out.println(prod.getPriceInfo().getPrice());
		
		
		
		return "index";
	}
	
	@RequestMapping(value = "/loadFormV1")
	public String loadFormV1(Model model,@ModelAttribute Product product) {
		
		model.addAttribute("categories",ssi.getCategories() );
		model.addAttribute("product",product);
		return "product-form2";
	}
	
	@GetMapping(value = "/loadCategories")
	@ResponseBody
	public List<Brand> loadStoreNames(@RequestParam int categoryId) {
		System.out.println("... loading stores...");
		
		//System.out.println("Selected location:: "+product.getStoreInfo().getLocation());
		System.out.println("======>"+categoryId);
		return ssi.getBrands(categoryId);
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
