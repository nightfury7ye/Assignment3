package com.techlabs.synchronization;

public class Producer implements Runnable {
	QueueResource queueResource;
	Producer(QueueResource queueResource) {
	    this.queueResource = queueResource;
	    new Thread(this, "Producer").start();
	}
	  public void run() {
	    int i = 0;
	    while(true) {
	    	queueResource.put(i++);
	    } 
    }
}
