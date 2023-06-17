package com.techlabs.creational.factory.carFactory.abstractFactory;

public class Mahindra implements ICars {
	@Override
	public void start() {
		System.out.println("Mahindra Started");	
	}

	@Override
	public void stop() {
		System.out.println("Mahindra Stopped");	
	}
}
