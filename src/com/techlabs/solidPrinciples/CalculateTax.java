package com.techlabs.solidPrinciples;

public class CalculateTax {
	public void calculateTax(Invoice invoice) {
		invoice.tax = invoice.amount * 0.08;
	}

}
