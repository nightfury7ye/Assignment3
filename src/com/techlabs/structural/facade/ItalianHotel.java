package com.techlabs.structural.facade;

public class ItalianHotel implements IHotel {
	@Override
	public IMenu getMenu() {
		return new ItalianMenu();
	}
}
