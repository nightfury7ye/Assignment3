package com.techlabs.creational.factory.carFactory;

public class CarFactory {
	public ICars makeCars(CarType car) {
		if(car == CarType.Maruti)
			return new Maruti();
		else if(car == CarType.Tata)
			return new Tata();
		else if(car == CarType.Mahindra)
			return new Mahindra();
		return null;
	}
}
