package com.techlabs.structural.adapter;

import java.util.List;

public class ShoppingCart {
	List<IItems> cartItems;

	public ShoppingCart(List<IItems> cartItems) {
		super();
		this.cartItems = cartItems;
	}
	public void addItemToCart(IItems item) {
		cartItems.add(item);
	}
	public List<IItems> getCartItems() {
		return cartItems;
	}
	public double getCartPrice() {
		double totalPrice = 0;
		for (IItems item : cartItems) {
			totalPrice += item.getItemPrice();
		}
		return totalPrice;
	}
	
}
