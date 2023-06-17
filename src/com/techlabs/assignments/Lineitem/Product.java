package com.techlabs.assignments.Lineitem;

public class Product {
	int id;
	String name;
	double price, discountPercent;
	public Product(int id, String name, double price, double discountPercent) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discountPercent = discountPercent;
	}
	public Product() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public void calculateDiscountPrice() {
		
	}
	
}
