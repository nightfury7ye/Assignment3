package com.techlabs.behaviour.Observer;

import java.util.Scanner;

public class TestAccountNotifier {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String option;
		Account account = new Account(12, "Praveen", 5000);
		System.out.println("Do you want SMS Notifier type \"yes\" or \"no\"");
		option = scanner.nextLine();
		if(option.equals("yes")) {
			account.registerNotifier(new SMSNotifier());
		}
		System.out.println("Do you want Email Notifier type yes or no");
		option = scanner.nextLine();
		if(option.equals("yes")) {
			account.registerNotifier(new EmailNotifier());
		}
		System.out.println("Do you want Whatsapp Notifier type yes or no");
		option = scanner.nextLine();
		if(option.equals("yes")) {
			account.registerNotifier(new WhatsappNotifier());
		}
		try {
			account.withdraw(1000);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		account.deposit(200);
	}

}
