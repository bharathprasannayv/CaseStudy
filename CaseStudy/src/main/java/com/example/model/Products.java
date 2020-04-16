package com.example.model;

import java.util.List;

public class Products {

	private String productCategoryType;
	
	private List<Product> productsList;

	public String getProductCategoryType() {
		return productCategoryType;
	}

	public void setProductCategoryType(String productCategoryType) {
		this.productCategoryType = productCategoryType;
	}

	public List<Product> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<Product> productsList) {
		this.productsList = productsList;
	}

	public Products(String productCategoryType, List<Product> productsList) {
		super();
		this.productCategoryType = productCategoryType;
		this.productsList = productsList;
	}

	@Override
	public String toString() {
		return "Products [productCategoryType=" + productCategoryType + ", productsList=" + productsList + "]";
	}
	
	
 }
