package com.techlabs.executorService;

public class MyThread implements Runnable {
	private String name;
	public MyThread(String name) {
		this.name = name;
	}
	@Override
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
