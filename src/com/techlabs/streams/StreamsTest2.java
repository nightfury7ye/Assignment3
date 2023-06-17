package com.techlabs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest2 {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(4,19,16,7);
		num.stream().filter((number) ->number%2==0).forEach((number) -> System.out.println(number));
		
		List<Integer> evens = num.stream().filter((number) ->number%2==0).collect(Collectors.toList());
		evens.stream().forEach((e)-> System.out.println(e));
		
		System.out.println( num.stream().reduce(0, (num1,num2)-> num1+num2));
		
	}

}
