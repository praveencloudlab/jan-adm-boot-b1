package com.cts.ecart.model;

public class StockInfo {
	
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
	
	
	

}
