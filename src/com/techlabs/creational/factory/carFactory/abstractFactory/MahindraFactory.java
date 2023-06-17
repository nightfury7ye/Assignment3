package com.techlabs.creational.factory.carFactory.abstractFactory;

public class MahindraFactory implements ICarFactory{

	@Override
	public ICars makeCar() {
		return new Mahindra();
	}
}
