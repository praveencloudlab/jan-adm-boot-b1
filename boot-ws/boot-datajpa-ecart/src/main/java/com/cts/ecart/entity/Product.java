package com.cts.ecart.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name="products")
@Setter
@Getter
@ToString
public class Product {
	@Id
	@GeneratedValue
	private int productId;
	private String productTitle;
	private String keywords;
	private String description;
	private double rating;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "brandId")
	private Brand brand;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "categoryId")
	private Category category;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "priceId")
	private PriceInfo priceInfo;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "stockId")
	private StockInfo stockInfo;
	
	
	
	
	
	
}
