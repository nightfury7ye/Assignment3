package com.techlabs.solidPrinciples;

public class Invoice {
	int invoiceId;
	String name;
	double amount;
	double tax;
	public Invoice(int invoiceId, String name, double amount) {
		super();
		this.invoiceId = invoiceId;
		this.name = name;
		this.amount = amount;
	}
	
	public Invoice() {
		super();
	}

	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
}
