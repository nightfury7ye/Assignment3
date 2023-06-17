package com.techlabs.creational.prototype;

abstract class Color implements Cloneable{
	protected String colorName;
    abstract String addColor();
      
    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}
