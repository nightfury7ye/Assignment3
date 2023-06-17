package com.techlabs.structural.facade;

public class HotelReception {
	public void getIndianMenu() {
		IHotel indianHotel = new IndianHotel();
		IMenu menu = indianHotel.getMenu();
		menu.DisplayMenu();
	}
	public void getItalianMenu() {
		IHotel italianHotel = new ItalianHotel();
		IMenu menu = italianHotel.getMenu();
		menu.DisplayMenu();
	}
}
