package com.techlabs.assignments.Lineitem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TestLineItems {

	public static void main(String[] args) throws ParseException {
		List<LineItem> lineItems = new ArrayList<LineItem>();
		lineItems.add(new LineItem(1, 3, new Product(1, "shampoo", 169, 5)));
		lineItems.add(new LineItem(2, 2, new Product(2, "chyawanprash", 350, 15)));
		lineItems.add(new LineItem(3, 4, new Product(3, "kala namak", 250, 10)));
		lineItems.add(new LineItem(4, 1, new Product(4, "Khas Khas", 50, 2)));
		
		List<LineItem> lineItems2 = new ArrayList<LineItem>();
		lineItems2.add(new LineItem(1, 2, new Product(1, "Adrak", 20, 2)));
		lineItems2.add(new LineItem(2, 1, new Product(2, "Emli", 150, 10)));
		
		Order order1 = new Order(1, new SimpleDateFormat("dd/MM/yyyy").parse("24/2/2023"), lineItems);
		Order order2 = new Order(2, new SimpleDateFormat("dd/MM/yyyy").parse("25/3/2023"), lineItems2);
		
		List<Order> orders = new ArrayList<Order>();
		orders.add(order1);
		orders.add(order2);
		
		
		Customer customer = new Customer(1, "Praveen", orders);
		System.out.println("For Customer: "+ customer.name+"\n");
		for (Order order : customer.orders) {
			System.out.println(" Order"+order.getId());
	        System.out.println(" -----------------------------------------------------");
			System.out.printf("| %-6s %-13s %-9s %-8s %9s |\n","ID","Name","Quantity","Unit Price","Total");
	        System.out.println(" -----------------------------------------------------");
			for (LineItem lineItem : order.getItems()) {
				System.out.printf("| %-5d  %-13s  %-9d  %8.2f  %8.2f |\n\n",lineItem.getId(), lineItem.getProduct().getName(), lineItem.getQuantity(), lineItem.getUnitPrice(), lineItem.calculateLineItemCost());
			}
			System.out.printf("| %-6s %-13s %-9s %10s %9.2f |\n","","","","Total:", order.orderPrice());
	        System.out.println(" -----------------------------------------------------\n");
		}
	}

}
