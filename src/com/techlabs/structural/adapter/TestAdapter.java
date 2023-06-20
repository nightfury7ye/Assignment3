package com.techlabs.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class TestAdapter {

	public static void main(String[] args) {
		List<IItems> items = new ArrayList<IItems>();
		items.add(new Biscuit("tiger", 20));
		items.add(new HatAdapter(new Hat("leather Brown Hat", "brown hat", 500, 18)));
		
		ShoppingCart shoppingCart = new ShoppingCart(items);
		for (IItems item : shoppingCart.getCartItems()) {
			System.out.printf("%-15s  %-6.2f\n",item.getItemName(),item.getItemPrice());
		}
		System.out.printf("%-16s %-6.2f","Total Price:",shoppingCart.getCartPrice());
	}

}
