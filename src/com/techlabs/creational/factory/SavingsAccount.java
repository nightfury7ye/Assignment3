package com.techlabs.creational.factory;

public class SavingsAccount extends Account {
	private String name;
	
	public SavingsAccount(int account, double balance, String name) {
		super(account, balance);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getInterestRate() {
		return 8.5;
	}

	@Override
	public String toString() {
		return "SavingsAccount [name=" + name + "]";
	}
	
}
