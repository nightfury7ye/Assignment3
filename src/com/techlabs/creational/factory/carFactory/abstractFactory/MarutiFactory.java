package com.techlabs.creational.factory.carFactory.abstractFactory;

public class MarutiFactory implements ICarFactory{

	@Override
	public ICars makeCar() {
		return new Maruti();
		
	}

}
