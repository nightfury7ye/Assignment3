package com.techlabs.structural.decorator.hat;

public class GoldenHat extends HatDecorator{

	public GoldenHat(IHat hat) {
		super(hat);
	}
	public String getName() {
		return super.getName();
	}

	public double getPrice() {
		return super.getPrice() + 100;
	}

	public String getDescription() {
		return super.getDescription();
	}
	public String getMaterialName() {
		return "Golden Hat";
	}
	
}
