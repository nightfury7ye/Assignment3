package com.techlabs.solidPrinciples;

public class PrintInvoice {
	public void printInvoice(Invoice invoice) {
		System.out.println("invoice Id:"+ invoice.invoiceId+"\nName: "+ invoice.name+ "\nTax: "+ invoice.tax +"\nTotal amount is: "+ (invoice.tax+invoice.amount));
	}
}
