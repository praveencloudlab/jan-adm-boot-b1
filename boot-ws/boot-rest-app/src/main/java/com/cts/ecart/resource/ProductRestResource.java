package com.cts.ecart.resource;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ecart.model.Product;


@RestController
@RequestMapping("/api/v1/products")
public class ProductRestResource {
	
	@GetMapping
	public String f1() {
		return "GET requrst-f1";
	}
	
	@GetMapping("/{productId}")
	public String f111(@PathVariable int productId) {
		return "GET requrst-f111 - "+productId;
	}
	
	@GetMapping(value = "/byId")
	public String f11() {
		return "GET requrst-f11";
	}
	
	@GetMapping(value = "/byName")
	public String f12() {
		return "GET requrst-f12";
	}
	
	@PostMapping
	public Product f2(@RequestBody Product prod) {
		System.out.println(">>> posting to DB");
		System.out.println(prod);
		return prod;
	}
	
	@PostMapping("/all")
	public List<Product> f222(@RequestBody List<Product> prods) {
		System.out.println(">>> posting to DB");
		System.out.println(prods);
		return prods;
	}
	
	
	@PutMapping
	public String f3() {
		return "PUT requrst";
	}
	
	@DeleteMapping
	public String f4() {
		return "DELETE requrst";
	}

}
