package com.techlabs.behaviour.Observer;

import java.util.ArrayList;
import java.util.List;

public class Account {
	int accountNo;
	String name;
	double balance;
	List<INotifier> notifiers;
	public Account(int accountNo, String name, double balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		this.notifiers = new ArrayList<INotifier>();
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public List<INotifier> getNotifiers() {
		return notifiers;
	}
	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}
	
	public void deposit(double amount) {
		balance += amount;
		sendNotify("has been Deposited: ", amount);
	}
	public void withdraw(double amount) throws InsufficientFundsException {
		if(balance-amount < 2000) {
			throw new InsufficientFundsException();
		}
		balance -= amount;
		sendNotify("has been Withdrawn: ", amount);
	}
	public void registerNotifier(INotifier iNotifier) {
		notifiers.add(iNotifier);
	}
	public void sendNotify(String message, double amount) {
		for (INotifier notifier : notifiers) {
			notifier.notifyIt(this);
			System.out.println(amount+ " "+ message);
			System.out.println();
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Account [accountNo: " + accountNo + ", name: " + name + ", balance: " + balance + "]";
	}
	
}
