package com.techlabs.behaviour.Observer;

public class EmailNotifier implements INotifier {
	@Override
	public void notifyIt(Account account) {
		System.out.println("Email: "+ account);
	} 
}
