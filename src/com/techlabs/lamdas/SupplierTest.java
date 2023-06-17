package com.techlabs.lamdas;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "THIS IS SUPPLIER";
		System.out.println("-> "+ supplier.get());

	}

}
