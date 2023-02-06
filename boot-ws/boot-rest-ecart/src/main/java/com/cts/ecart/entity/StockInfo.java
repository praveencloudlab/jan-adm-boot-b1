package com.cts.ecart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StockInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int stockId;
	private int stock;
	
	public StockInfo() {
		// TODO Auto-generated constructor stub
	}

	public StockInfo(int stockId, int stock) {
		super();
		this.stockId = stockId;
		this.stock = stock;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "StockInfo [stockId=" + stockId + ", stock=" + stock + "]";
	}
	
	
	

}
