package com.techlabs.lamdas;

import java.util.function.Consumer;

public class LamdaFactorial {

	public static void main(String[] args) {
		Consumer<Integer> consumer = (num)-> {
		int fact = 1;
		while(num>1) {
			fact *= num;
			num--;
		}
		System.out.println("Factorial of "+ num + " is: " + fact);
		};
		consumer.accept(5);
	}

}
