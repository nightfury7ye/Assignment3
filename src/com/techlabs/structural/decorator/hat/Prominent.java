package com.techlabs.structural.decorator.hat;

public class Prominent implements IHat{
	@Override
	public String getName() {
		return "Prominent Hat";
	}

	@Override
	public double getPrice() {
		return 1000;
	}

	@Override
	public String getDescription() {
		return "It is a Prominent looking Hat";
	} 
}
