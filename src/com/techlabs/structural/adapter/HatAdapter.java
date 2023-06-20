package com.techlabs.structural.adapter;

public class HatAdapter implements IItems {
	Hat hat;

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getItemName() {
		return hat.getShortName();
	}

	@Override
	public double getItemPrice() {
		return hat.getBasicPrice() + (hat.getBasicPrice()*hat.getTax()/100);
	}
	
}
