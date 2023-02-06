package com.cts.ecart.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;

@Entity(name = "brands")
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int brandId;
	private String brandTitle;
	

	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinTable(name = "brand_info", joinColumns = @JoinColumn(name = "brandId"), inverseJoinColumns = @JoinColumn(name = "productId"))
	List<Product> products = new ArrayList<>();

	public Brand() {
		// TODO Auto-generated constructor stub
	}

	public Brand(int brandId, String brandTitle) {
		super();
		this.brandId = brandId;
		this.brandTitle = brandTitle;
		
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getBrandTitle() {
		return brandTitle;
	}

	public void setBrandTitle(String brandTitle) {
		this.brandTitle = brandTitle;
	}

	

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandTitle=" + brandTitle  + ", products="
				+ products + "]";
	}
	
	

}
