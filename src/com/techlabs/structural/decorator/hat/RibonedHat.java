package com.techlabs.structural.decorator.hat;

public class RibonedHat extends HatDecorator{

	public RibonedHat(IHat hat) {
		super(hat);
	}
	public String getName() {
		return super.getName();
	}

	public double getPrice() {
		return super.getPrice() + 150;
	}

	public String getDescription() {
		return super.getDescription();
	}
	public String getMaterialName() {
		return "Riboned Hat";
	}
}
