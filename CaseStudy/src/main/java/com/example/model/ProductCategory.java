package com.example.model;

public class ProductCategory {

	private long productCategoryId;
	private String categoryType;
	
	public long getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public String getCategoryType() {
		return categoryType;
	}
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
	public ProductCategory(long productCategoryId, String categoryType) {
		super();
		this.productCategoryId = productCategoryId;
		this.categoryType = categoryType;
	}
	@Override
	public String toString() {
		return "ProductCategory [productCategoryId=" + productCategoryId + ", categoryType=" + categoryType + "]";
	}
	
	
}
