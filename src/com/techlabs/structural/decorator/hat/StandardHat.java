package com.techlabs.structural.decorator.hat;

public class StandardHat implements IHat{

	@Override
	public String getName() {
		return "Standard Hat";
	}

	@Override
	public double getPrice() {
		return 500;
	}

	@Override
	public String getDescription() {
		return "It is a Standard looking Hat";
	} 

}
