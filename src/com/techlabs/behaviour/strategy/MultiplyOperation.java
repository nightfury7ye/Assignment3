package com.techlabs.behaviour.strategy;

public class MultiplyOperation implements IOperation {
	@Override
	public int doOperation(int a, int b) {
		return a*b;
	}
}
