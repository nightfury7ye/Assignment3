package com.techlabs.streams;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<List<Integer>> lists = Arrays.asList(
				Arrays.asList(1,2,3),Arrays.asList(6,4,13),Arrays.asList(11,22,7));
		
		System.out.println(lists.stream()
				.flatMap(list -> list.stream())
				.reduce(0, (x,y)-> x+y));
		
//		lists.stream().map(list -> list.stream().map(list -> System.out.println(list)));

	}

}
