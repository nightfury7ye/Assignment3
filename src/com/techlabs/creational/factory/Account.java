package com.techlabs.creational.factory;

public abstract class Account {
	private int account;
	private double balance;
	public Account(int account, double balance) {
		super();
		this.account = account;
		this.balance = balance;
	}
	public Account() {
		super();
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	abstract public double getInterestRate();
	
}
