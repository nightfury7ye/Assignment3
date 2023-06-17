package com.techlabs.lamdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

	public static void main(String[] args) {
		UnaryOperator<Integer> square = num -> num * num;
        System.out.println(square.apply(5));
	}

}
