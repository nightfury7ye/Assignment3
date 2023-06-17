package com.techlabs.streams;

import java.util.Arrays;

public class AssignmentOnStreams {
	
	static void print(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		String[] names= {"Jayesh","Nimesh","Mahesh","Ramesh"};
		
		Arrays.stream(names).forEach((name) -> System.out.println(name));
		System.out.println();
		
		Arrays.asList(names).forEach((name) -> System.out.println(name));
		System.out.println();
		
		Arrays.stream(names).forEach(AssignmentOnStreams::print);
	}

}
