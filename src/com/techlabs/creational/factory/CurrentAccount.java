package com.techlabs.creational.factory;

public class CurrentAccount extends Account {
	private String name;

	public CurrentAccount(int account, double balance, String name) {
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
		return 7.5;
	}

	@Override
	public String toString() {
		return "CurrentAccount [name=" + name + "]";
	}
	
}
