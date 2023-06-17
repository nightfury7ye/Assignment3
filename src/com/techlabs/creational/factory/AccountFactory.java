package com.techlabs.creational.factory;

public class AccountFactory {
	private static Account account; 
	
	public static Account generateAccount(String type) {
		if(type.contentEquals("savings"))
			account = new CurrentAccount(12, 10000, "Praveen");
		if(type.contentEquals("current"))
			account = new SavingsAccount(1345, 17000, "Pavan");
		return account;
	}
}
