package com.cts.ecart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity; // JAVA EE 9
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "products")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	@Column(name = "product_name")
	private String productName;
	private double price;
	private String description;
	
	
	

	
}
