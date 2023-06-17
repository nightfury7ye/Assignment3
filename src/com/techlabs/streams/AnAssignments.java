package com.techlabs.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AnAssignments {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Pavan","Chotu","Praveen","Avinash");
		names.stream().sorted().limit(3).forEach((name) -> System.out.println(name));
		System.out.println();
		names.stream().sorted().filter((name) -> name.contains("a")).limit(3).forEach((name)-> System.out.println(name));
		System.out.println();
		names.stream().sorted(Comparator.reverseOrder()).limit(3).forEach((name) -> System.out.println(name));
		System.out.println();
		names.stream().filter(name -> name.length() <= 4).forEach((name)-> System.out.println(name));
		System.out.println();
		names.stream().map(name -> name.substring(0, 3)).forEach((name) -> System.out.println(name));
		System.out.println();
		
		List<Integer> numbers=Arrays.asList(10,20,30,40,50,25,35,45);

	}

}
