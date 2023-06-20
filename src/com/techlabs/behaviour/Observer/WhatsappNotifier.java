package com.techlabs.behaviour.Observer;

public class WhatsappNotifier implements INotifier {
	@Override
	public void notifyIt(Account account) {
		System.out.println("Whatsapp: "+ account);
	} 
}
