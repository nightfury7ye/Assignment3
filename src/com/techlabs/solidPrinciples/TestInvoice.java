package com.techlabs.solidPrinciples;

public class TestInvoice {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(123, "praveen", 1000);
		CalculateTax calculateTax = new CalculateTax();
		calculateTax.calculateTax(invoice);
		PrintInvoice printInvoice = new PrintInvoice();
		printInvoice.printInvoice(invoice);

	}

}
