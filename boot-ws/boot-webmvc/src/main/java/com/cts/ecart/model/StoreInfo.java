package com.cts.ecart.model;

public class StoreInfo {
	private int storeId;
	private String storeName;
	private String location;
	private String productBrad;
	private String categoryName;

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getProductBrad() {
		return productBrad;
	}

	public void setProductBrad(String productBrad) {
		this.productBrad = productBrad;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "StoreInfo [storeId=" + storeId + ", storeName=" + storeName + ", location=" + location
				+ ", productBrad=" + productBrad + ", categoryName=" + categoryName + "]";
	}

	
}
