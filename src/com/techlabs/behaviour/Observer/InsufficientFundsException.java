package com.techlabs.behaviour.Observer;

public class InsufficientFundsException extends Exception{
	public String getMessage() {
		return "Insufficient Balance";
	}
}
