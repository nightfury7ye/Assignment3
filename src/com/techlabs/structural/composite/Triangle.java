package com.techlabs.structural.composite;

public class Triangle implements IShape {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Triangle with color "+fillColor);
	}

}
