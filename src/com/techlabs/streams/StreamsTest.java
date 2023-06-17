package com.techlabs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Pavan","Chotu","Praveen");
		
		Stream<String> stream = names.stream();
		stream.forEach((name) -> {System.out.println(name);});
		
		List<String> helloNames = names.stream().map((name) -> "Hello "+name).collect(Collectors.toList()) ;
		helloNames.stream().forEach((name) -> System.out.println(name));
		
		names.stream().sorted().forEach((name) -> System.out.println(name));

		names.stream().sorted().limit(3).forEach((name) -> System.out.println(name));
		System.out.println();
		System.out.println(names.stream().sorted().findFirst());
		System.out.println(names.stream().anyMatch((name)-> name.contains("Praveen")));
		
		Optional<String> belongs = names.stream().findAny();
		
		if(belongs.isPresent())
			System.out.println(belongs);
	}

}
