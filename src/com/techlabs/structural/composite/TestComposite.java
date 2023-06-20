package com.techlabs.structural.composite;

public class TestComposite {
	public static void main(String[] args) {
		IShape tri = new Triangle();
		IShape tri1 = new Triangle();
		IShape cir = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(cir);
		
		drawing.draw("Red");
		
		drawing.clear();
		
		drawing.add(tri);
		drawing.add(cir);
		drawing.draw("Green");
	}
}
