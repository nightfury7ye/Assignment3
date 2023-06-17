package com.techlabs.multiThreading;

public class MyThread extends Thread {
	private String name;
	public MyThread(String name) {
		super(name);
		start();
	}
	public void run() {
		for(int i= 0; i<5; i++) {
			System.out.println(Thread.currentThread()+":"+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
