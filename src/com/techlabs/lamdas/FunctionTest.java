package com.techlabs.lamdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {

	private static Object object;

	public static void main(String[] args) {
		Function<Integer, Integer> function = (num) -> {
			int fact = 1;
			while(num>1) {
				fact *= num;
				num--;
			}
			return fact;
		};
		System.out.println(function.apply(5));
		
		Function<Integer, Integer> squareFunction = (num) -> num*num;
		System.out.println(function.andThen(squareFunction).apply(5));
		System.out.println(squareFunction.andThen(function).apply(5));
		
		BiFunction<Integer, Integer, Integer> additionFunction = (num1,num2) -> num1+num2;
		System.out.println(additionFunction.andThen(function).apply(3, 2));

	}

}
