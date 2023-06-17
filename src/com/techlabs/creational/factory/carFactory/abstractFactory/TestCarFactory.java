package com.techlabs.creational.factory.carFactory.abstractFactory;

public class TestCarFactory {

	public static void main(String[] args) {
		ICarFactory marutiFactory = new MarutiFactory();
		ICars maruti = marutiFactory.makeCar();
		maruti.start();
		maruti.stop();
		ICarFactory tataFactory = new TataFactory();
		ICars tata = tataFactory.makeCar();
		tata.start();
		tata.stop();
		ICarFactory mahindraFactory = new MahindraFactory();
		ICars mahindra = mahindraFactory.makeCar();
		mahindra.start();
		mahindra.stop();

	}

}
