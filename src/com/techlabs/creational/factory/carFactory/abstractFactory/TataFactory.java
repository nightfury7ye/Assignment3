package com.techlabs.creational.factory.carFactory.abstractFactory;

public class TataFactory implements ICarFactory{

	@Override
	public ICars makeCar() {
		return new Tata();
	}
}
