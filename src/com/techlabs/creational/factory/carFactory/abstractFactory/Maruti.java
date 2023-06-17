package com.techlabs.creational.factory.carFactory.abstractFactory;

public class Maruti implements ICars {

	@Override
	public void start() {
		System.out.println("Maruti Started");	
	}

	@Override
	public void stop() {
		System.out.println("Maruti Stopped");	
	}

}
