package com.techlabs.OCP;

public class TestFixedDeposit {

	public static void main(String[] args) {
		FixedDeposit fixedDeposit = new FixedDeposit(140045,12,"Praveen", 500, new HoliInterest());
		System.out.println(fixedDeposit);
		System.out.println("Simple Interest: "+fixedDeposit.calculateSimpleInterest());
	}

}
