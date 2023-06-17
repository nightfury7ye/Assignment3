package com.techlabs.multiThreading;

public class TestThread {

	public static void main(String[] args) {
		MyThread thread = new MyThread("praveen");
		System.out.println(thread.currentThread());
		for(int i= 0; i<5; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
