package com.techlabs.behaviour.stateDesign;

public class TestPackage {

	public static void main(String[] args) {
		Package package1 = new Package();
		package1.printState();
		package1.nextState();
		package1.printState();
		package1.nextState();
		package1.printState();
		System.out.println();
		package1.nextState();
		package1.printState();
		
	}

}
