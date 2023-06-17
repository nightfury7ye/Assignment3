package com.techlabs.creational.factory;

public class TestAccount {

	public static void main(String[] args) {
		Account currentAccount = AccountFactory.generateAccount("savings");
		System.out.println(currentAccount+ ":" +currentAccount.getInterestRate());
		Account savingsAccount = AccountFactory.generateAccount("savings");
		System.out.println(savingsAccount+ ":" +savingsAccount.getInterestRate());
	}

}
