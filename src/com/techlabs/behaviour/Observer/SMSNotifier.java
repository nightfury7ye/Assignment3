package com.techlabs.behaviour.Observer;

public class SMSNotifier implements INotifier {

	@Override
	public void notifyIt(Account account) {
		System.out.println("SMS: "+ account);
	} 

}
