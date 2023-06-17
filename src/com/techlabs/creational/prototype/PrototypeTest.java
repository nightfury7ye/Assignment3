package com.techlabs.creational.prototype;

public class PrototypeTest {

	public static void main(String[] args) {
        String color = ColorStore.getColor("blue").addColor();
        System.out.println(color);
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("blue").addColor();

	}

}
