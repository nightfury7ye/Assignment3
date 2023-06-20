package com.techlabs.assignments.Lineitem;

public class LineItem {
	int id, quantity;
	Product product;
	double unitPrice;
	public LineItem(int id, int quantity, Product product) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.product = product;
		this.unitPrice = Math.floor(product.calculateDiscountPrice());
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice() {
		this.unitPrice = Math.floor(product.calculateDiscountPrice());
	}
	public double calculateLineItemCost(){
		return Math.floor(quantity * product.calculateDiscountPrice());
	}
	
}
