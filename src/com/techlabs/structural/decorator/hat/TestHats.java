package com.techlabs.structural.decorator.hat;

import java.util.Scanner;

public class TestHats {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose One\n 1. Standard\n 2. Prominent");
		int hatOption= scanner.nextInt();
		IHat hat = hatOption==1 ? new StandardHat() : new Prominent();
		
		System.out.println("Choice Material of the Hat\n 1. Golden\n 2. Riboned");
		int matOption = scanner.nextInt();
		HatDecorator goldenHat = matOption==1 ? new GoldenHat(hat) : new RibonedHat(hat);
		
		System.out.println(goldenHat.getName()+"\n"+goldenHat.getPrice()+"\n"+goldenHat.getDescription()+"\n"+goldenHat.getMaterialName());
	}

}
