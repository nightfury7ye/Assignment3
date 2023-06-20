package com.techlabs.behaviour.strategy;

public class AddOperation implements IOperation {

	@Override
	public int doOperation(int a, int b) {
		return a+b;
	}

}
