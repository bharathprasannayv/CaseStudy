package com.example.model;

public class Product {

	private long productId;
	private String brand;
	private double price;
	private String color;
	private int size;
	private String gsk;
	private String productCategoryType;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getGsk() {
		return gsk;
	}
	public void setGsk(String gsk) {
		this.gsk = gsk;
	}
	
	public String getProductCategoryType() {
		return productCategoryType;
	}
	public void setProductCategoryType(String productCategoryType) {
		this.productCategoryType = productCategoryType;
	}
	public Product(long productId, String brand, double price, String color, int size, String gsk,
			String productCategoryType) {
		super();
		this.productId = productId;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
		this.gsk = gsk;
		this.productCategoryType = productCategoryType;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", brand=" + brand + ", price=" + price + ", color=" + color
				+ ", size=" + size + ", gsk=" + gsk + ", productCategoryType=" + productCategoryType + "]";
	}

	
	
}
