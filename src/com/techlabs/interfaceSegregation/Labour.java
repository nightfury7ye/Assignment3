package com.techlabs.interfaceSegregation;

public class Labour implements IWorkable,ILunch{

	@Override
	public void startWork() {
		System.out.println("Labour has started the work");
	}

	@Override
	public void stopWork() {
		System.out.println("Labour has stopped the work");
		
	}

	@Override
	public void eat() {
		System.out.println("Labour is Eating");
		
	}

	@Override
	public void drink() {
		System.out.println("Labour is Drinking");		
	}

}
