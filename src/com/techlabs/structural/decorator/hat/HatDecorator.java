package com.techlabs.structural.decorator.hat;

public abstract class HatDecorator implements IHat{
	private IHat hat;
	
	public HatDecorator(IHat hat) {
		super();
		this.hat = hat;
	}
	abstract public String getMaterialName();
	@Override
	public String getName() {
		return hat.getName();
	}

	@Override
	public double getPrice() {
		return hat.getPrice();
	}

	@Override
	public String getDescription() {
		return hat.getDescription();
	}
	
}
