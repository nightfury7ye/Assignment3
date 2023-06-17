package com.techlabs.dependencyInversion;

public class TaxCalculator {
	private ILogger iLogger;
	private int tax = 0;
	public TaxCalculator(ILogger iLogger) {
		this.iLogger = iLogger;
	}
	public ILogger getiLogger() {
		return iLogger;
	}
	public void setiLogger(ILogger iLogger) {
		this.iLogger = iLogger;
	}
	public void calculateTax(int amount, int rate) {
		try {
			tax = amount/rate;
			System.out.println("Tax: "+ tax);
		} catch (ArithmeticException e) {
			iLogger.log("Divide by Zero");
		}
	}
}
