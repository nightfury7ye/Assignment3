package com.techlabs.behaviour.strategy;

public class TestOperation {

	public static void main(String[] args) {
		OperationStrategy operationStrategy = new OperationStrategy(new AddOperation());
		System.out.println( operationStrategy.doOperation(5, 8));
		operationStrategy.setOperation(new MultiplyOperation());
		System.out.println( operationStrategy.doOperation(5, 8));
	}

}
