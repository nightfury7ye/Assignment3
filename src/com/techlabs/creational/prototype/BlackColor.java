package com.techlabs.creational.prototype;

public class BlackColor extends Color {
    public BlackColor()
    {
        this.colorName = "black";
    }
  
    @Override
    String addColor()
    {
        System.out.println("Black color added");
        return colorName;
    }
}
