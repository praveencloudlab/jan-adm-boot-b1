package com.cts.ecart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity(name="price_info")
public class PriceInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int priceId;
	private double price;	
}
