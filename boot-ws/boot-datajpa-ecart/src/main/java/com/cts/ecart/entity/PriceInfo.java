package com.cts.ecart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name="price_info")
@Setter
@Getter
@ToString
public class PriceInfo {
	@Id
	@GeneratedValue
	private int priceId;
	private double price;
}
