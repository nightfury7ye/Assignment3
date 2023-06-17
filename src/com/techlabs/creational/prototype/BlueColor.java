package com.techlabs.creational.prototype;

public class BlueColor extends Color {
    public BlueColor()
    {
        this.colorName = "blue";
    }
  
    @Override
    String addColor()
    {
        System.out.println("Blue color added");
        return colorName;
    }
}
