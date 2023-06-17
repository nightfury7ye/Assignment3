package com.techlabs.lamdas;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<String> consumer = (String)-> System.out.println(String);
		consumer.accept("Praveen Test");
		
		BiConsumer<Integer, Integer> biConsumer = (a,b)->System.out.println(a+b);
		biConsumer.accept(5, 10);

	}

}
