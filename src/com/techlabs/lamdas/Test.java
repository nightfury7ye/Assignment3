package com.techlabs.lamdas;

public class Test {

	public static void main(String[] args) {
//		anonymous class
		ITester tester = () -> System.out.println("Hiee");
		tester.test();

	}

}
