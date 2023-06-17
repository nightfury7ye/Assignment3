package com.techlabs.structural.facade;

public class IndianHotel implements IHotel {

	@Override
	public IMenu getMenu() {
		return new IndianMenu();
	}
	
}
