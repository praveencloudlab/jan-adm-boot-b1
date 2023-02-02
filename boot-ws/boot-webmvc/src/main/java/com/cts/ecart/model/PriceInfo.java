package com.cts.ecart.model;

public class PriceInfo {

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
