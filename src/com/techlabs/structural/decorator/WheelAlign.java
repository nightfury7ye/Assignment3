package com.techlabs.structural.decorator;

public class WheelAlign extends CarServiceDecorator{
	public WheelAlign(ICarService car) {
		super(car);
	}
	@Override
	public double getCost() {
		return super.getCost()+1000;
	}
}
