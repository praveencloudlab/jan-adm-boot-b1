package com.cts.ecart.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ecart.entity.Brand;
import com.cts.ecart.entity.Category;
import com.cts.ecart.entity.Product;
import com.cts.ecart.service.BrandServiceImpl;
import com.cts.ecart.service.CategoryServiceImpl;
import com.cts.ecart.service.ProductServiceImpl;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
	
	@Autowired
	private ProductServiceImpl psi;
	@Autowired
	private CategoryServiceImpl csi;
	@Autowired
	private BrandServiceImpl bsi;
	
	
	// list all products
	
	@GetMapping
	public List<Product> findAll(){
		return psi.findAll();
	}
	
	@GetMapping("/{productId}")
	public Product findById(@PathVariable int productId){
		return psi.findById(productId);
		
	}
	
	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		return psi.updateProduct(product);
	}
	
	
	// save new Product
	@PostMapping("/{brandId}")
	public Product saveProduct(@PathVariable int  brandId,@RequestBody Product product) {
		 Brand brand = bsi.findById(brandId);
		 Product prod = psi.save(product);
		 bsi.save(brand, product);
		 return prod;
		 //return save.getProducts().stream().filter(prod->prod.getProductId()==brandId).findFirst().orElse(null);	
	}
	
	
	@DeleteMapping("/{productId}")
	public void deleteProductById(@PathVariable int productId) {
		psi.deleteById(productId);
	}
	
	
	

}
