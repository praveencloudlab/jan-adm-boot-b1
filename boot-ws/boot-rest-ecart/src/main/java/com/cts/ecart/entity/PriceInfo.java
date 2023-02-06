package com.cts.ecart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PriceInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int priceId;
	private double price;
	
	 public PriceInfo() {
		// TODO Auto-generated constructor stub
	}

	public PriceInfo(int priceId, double price) {
		super();
		this.priceId = priceId;
		this.price = price;
	}

	public int getPriceId() {
		return priceId;
	}

	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PriceInfo [priceId=" + priceId + ", price=" + price + "]";
	}
	 
	
	 
}
