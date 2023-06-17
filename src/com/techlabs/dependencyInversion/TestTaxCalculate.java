package com.techlabs.dependencyInversion;

public class TestTaxCalculate {

	public static void main(String[] args) {
		TaxCalculator taxCalculator1 = new TaxCalculator(new DBLogger());
		taxCalculator1.calculateTax(1000, 0);
		taxCalculator1.setiLogger(new FileLogger());
		taxCalculator1.calculateTax(1000, 0);
	}

}
