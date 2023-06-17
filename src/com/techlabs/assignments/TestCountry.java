package com.techlabs.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class TestCountry {

	public static void main(String[] args) {
		List<Region> regionsList = Arrays.asList(new Region(1, "Europe"),new Region(2, "Americas"),new Region(3, "Asia"),new Region(4, "Middle East and Africa"));
		List<Country> countryList = Arrays.asList(
				new Country("IT", "Italy", 1),
				new Country("JP", "Japan", 3),
				new Country("US", "United States of America", 2),
                new Country("CA", "Canada", 2),
                new Country("CN", "China", 3),
                new Country("IN", "India", 3),
                new Country("AU", "Australia", 3),
                new Country("ZW", "Zimbabwe", 4),
                new Country("SG", "Singapore", 3),
                new Country("UK", "United Kingdom", 1),
                new Country("FR", "France", 1),
                new Country("DE", "Germany", 1),
                new Country("ZM", "Zambia", 4),
                new Country("EG", "Egypt", 4),
                new Country("BR", "Brazil", 2),
                new Country("CH", "Switzerland", 1),
                new Country("NL", "Netherlands", 1),
                new Country("MX", "Mexico", 2),
                new Country("KW", "Kuwait", 4),
                new Country("IL", "Israel", 4),
                new Country("DK", "Denmark", 1),
                new Country("HK", "Hong Kong", 3),
                new Country("NG", "Nigeria", 4),
                new Country("AR", "Argentina", 2),
                new Country("BE", "Belgium", 1)
		);
		
		regionsList.stream().forEach(region ->{
			AtomicInteger count = new AtomicInteger(0);
			System.out.println("Region Name: " + region.getRegionName());
			countryList.stream()
				.filter(country -> country.getRegId()==region.getRegionID())
				.forEach(country -> {
					System.out.println(country.getCountryName());
					count.incrementAndGet();;
				});
			System.out.println("Total No. of countries in this "+ region.getRegionName()+" "+count.get()+"\n");
		});;
		
		System.out.println("\nenter code of region that you want countries of: \n"
				+ "1, \"Europe\"\n"
				+ "2, \"Americas\"\n"
				+ "3, \"Asia\"\n"
				+ "4, \"Middle East and Africa\"\n"
				);
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		countryList.stream().filter(country -> country.getRegId()==option).forEach(country -> System.out.println(country.getCountryName()));
		
		
		int count = countryList.stream()
				.filter(country -> country.getRegId()==option)
				.map(country -> country.getRegId())
				.reduce(0, (acc, element) -> acc + 1);
		
		System.out.println("\nTotal No. of countries in this region: "+count);
		scanner.close();

	}

}
