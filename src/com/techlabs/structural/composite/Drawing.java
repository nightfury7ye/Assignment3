package com.techlabs.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements IShape{
private List<IShape> shapes = new ArrayList<IShape>();
	
	@Override
	public void draw(String fillColor) {
		for(IShape sh : shapes)
		{
			sh.draw(fillColor);
		}
	}
	
	public void add(IShape s){
		this.shapes.add(s);
	}
	
	public void remove(IShape s){
		shapes.remove(s);
	}
	
	public void clear(){
		System.out.println("Clearing all the shapes from drawing");
		this.shapes.clear();
	}
}
