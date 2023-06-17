package com.techlabs.dependencyInversion;

public class DBLogger implements ILogger {
	public void log(String err) {
		System.out.println("Logged to database: "+ err);
	}
}
