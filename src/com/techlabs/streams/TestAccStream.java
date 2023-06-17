package com.techlabs.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TestAccStream {

	public static void main(String[] args) {
		List<Account> accounts = Arrays.asList(new Account(101,"Praveen",10000),new Account(102,"Pavan",1000),new Account(103,"Chotu",24000),new Account(104,"Avinash",30000));
		accounts.stream().forEach(account -> System.out.println(account));
		
		Optional<Account> minBalanceAcc =  accounts.stream().min(Comparator.comparingDouble(Account::getBalance));
		if(minBalanceAcc.isPresent())
			System.out.println("Account with min Balance: "+ minBalanceAcc);
		
		Optional<Account> maxBalanceAcc =  accounts.stream().max(Comparator.comparingDouble(Account::getBalance));
		if(maxBalanceAcc.isPresent())
			System.out.println("Account with min Balance: "+ maxBalanceAcc);
		
		accounts.stream()
			.filter(account -> account.getName().length() > 6).forEach(account -> System.out.println(account));
		
		double balanceSum = accounts.stream()
			.mapToDouble(Account::getBalance)
			.sum();	
		System.out.println(balanceSum);
	}

}
