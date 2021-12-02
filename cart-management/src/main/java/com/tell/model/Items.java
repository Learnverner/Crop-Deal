package com.tell.model;

public class Items {

	
	private String cropName;
	private double price;
	private int quantity;
	
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String productName) {
		this.cropName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Items(String productName, double price, int quantity) {
		super();
		this.cropName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	public Items() {
		super();
	}
	@Override
	public String toString() {
		return "Items [productName=" + cropName+ ", price=" + price + ", quantity=" + quantity + "]";
	}
}