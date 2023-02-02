package com.cts.ecart.model;

public class Brand {

	private int brandId;
	private String brandTitle;
	private int categoryId;
	
	public Brand() {
		// TODO Auto-generated constructor stub
	}

	public Brand(int brandId, String brandTitle, int categoryId) {
		super();
		this.brandId = brandId;
		this.brandTitle = brandTitle;
		this.categoryId = categoryId;
	}
	
	


	public String getBrandTitle() {
		return brandTitle;
	}

	public void setBrandTitle(String brandTitle) {
		this.brandTitle = brandTitle;
	}

	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}


	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandTitle=" + brandTitle + ", categoryId=" + categoryId + "]";
	}

}
