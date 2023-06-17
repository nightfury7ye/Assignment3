package com.techlabs.multiThreading;

public class TestRunnableThread {

	public static void main(String[] args) {
//		RunnableThread runnableThread = new RunnableThread("Praveen");
		Thread thread = new Thread(new RunnableThread("Praveen"));
		thread.start();

	}

}
