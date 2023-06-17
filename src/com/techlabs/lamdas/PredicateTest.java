package com.techlabs.lamdas;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (a) -> a%2==0;
		System.out.println(predicate.test(4));
	
		BiPredicate<Integer, Integer> biPredicate = (a,b) -> a>b;
		int num1 = 5, num2 = 10;
		if(biPredicate.test(num1, num2)) {
			System.out.println(num1+ " is Greater Number");
		}
		else {
			System.out.println(num2+ " is Greater Number");
		}

	}

}
