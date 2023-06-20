package com.techlabs.structural.decorator;

public class CarInspector implements ICarService{
	
	@Override
	public double getCost() {
		return 1000;
	}
	
}
