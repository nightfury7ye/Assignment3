package com.techlabs.structural.adapter;

public class Hat {
	String longName, ShortName;
	double basicPrice, tax;
	public Hat(String longName, String shortName, double basicPrice, double tax) {
		super();
		this.longName = longName;
		ShortName = shortName;
		this.basicPrice = basicPrice;
		this.tax = tax;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public String getShortName() {
		return ShortName;
	}
	public void setShortName(String shortName) {
		ShortName = shortName;
	}
	public double getBasicPrice() {
		return basicPrice;
	}
	public void setBasicPrice(double basicPrice) {
		this.basicPrice = basicPrice;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
