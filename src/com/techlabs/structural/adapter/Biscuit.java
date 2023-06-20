package com.techlabs.structural.adapter;

public class Biscuit implements IItems{
	private String name;
	private double mrp;
	
	public Biscuit(String name, double mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}

	@Override
	public String getItemName() {
		return name;
		
	}

	@Override
	public double getItemPrice() {
		return mrp;
	}

}
