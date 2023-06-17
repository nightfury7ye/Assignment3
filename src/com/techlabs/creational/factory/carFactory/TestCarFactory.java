package com.techlabs.creational.factory.carFactory;

public class TestCarFactory {

	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		ICars maruti = carFactory.makeCars(CarType.Maruti);
		maruti.start();
		maruti.stop();
		ICars tata = carFactory.makeCars(CarType.Tata);
		tata.start();
		tata.stop();
		ICars mahindra = carFactory.makeCars(CarType.Mahindra);
		mahindra.start();
		mahindra.stop();

	}

}
