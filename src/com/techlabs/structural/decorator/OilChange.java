package com.techlabs.structural.decorator;

public class OilChange extends CarServiceDecorator {
	public OilChange(ICarService car) {
		super(car);
	}
	@Override
	public double getCost() {
		return super.getCost()+500;
	}
	
	
}
