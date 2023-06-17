package com.techlabs.lamdas;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

	public static void main(String[] args) {
		BinaryOperator<Integer> addition = (a, b) -> a + b;
        System.out.println(addition.apply(5, 3));
	}

}
