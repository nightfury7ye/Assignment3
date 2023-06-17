package com.techlabs.creational.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		Login login = Login.getLogin();
		Login login2 = Login.getLogin();
		
		if(login == login2)
			System.out.println("Success");
		else
			System.out.println("Failure");
	}

}
