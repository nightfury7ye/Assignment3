package com.techlabs.interfaceSegregation;

public class Robot implements IWorkable {
	@Override
	public void startWork() {
		System.out.println("Robot has started the work");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot has stopped the work");
		
	}

}
