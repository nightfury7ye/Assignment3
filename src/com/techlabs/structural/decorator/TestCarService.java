package com.techlabs.structural.decorator;

public class TestCarService {

	public static void main(String[] args) {
		ICarService car = new CarInspector();
		CarServiceDecorator oilChange = new OilChange(car);
		System.out.println("Car service with Oil change: "+ oilChange.getCost());
		CarServiceDecorator wheelAlign = new WheelAlign(car);
		System.out.println("Car service with Wheel Align: "+ wheelAlign.getCost());
		CarServiceDecorator wheelAlign2 = new WheelAlign(oilChange);
		System.out.println("Car service with Oil change & Wheel align: "+ wheelAlign2.getCost());
	}

}
