package com.techlabs.structural.facade;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		HotelReception hotelReception = new HotelReception();
		System.out.println("Enter Your choice:\n"
				+ "1. Indian Menu\n"
				+ "2. Italian Menu");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			hotelReception.getIndianMenu();
			break;
		case 2:
			hotelReception.getItalianMenu();
			break;
		default:
			break;
		}
	}
}
