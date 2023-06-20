package com.techlabs.structural.decorator;

public class CarServiceDecorator implements ICarService{
	private ICarService car;
	
	public CarServiceDecorator(ICarService car) {
		super();
		this.car = car;
	}

	@Override
	public double getCost() {
		return car.getCost();
	}

}
