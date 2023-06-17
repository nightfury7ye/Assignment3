package com.techlabs.interfaceSegregation;

public class TestWorker {

	public static void main(String[] args) {
		Labour labour = new Labour();
		labour.startWork();
		labour.stopWork();
		labour.eat();
		labour.drink();
		
		Robot robo = new Robot();
		robo.startWork();
		robo.stopWork();
	}

}
