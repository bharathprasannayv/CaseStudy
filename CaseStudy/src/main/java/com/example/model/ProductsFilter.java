package com.example.model;

public class ProductsFilter {

	private long userId;
	private String type;
	private String value;
	private String category;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public ProductsFilter(long userId, String type, String value, String category) {
		super();
		this.userId = userId;
		this.type = type;
		this.value = value;
		this.category = category;
	}
	
	
}
