package com.techlabs.synchronization;

public class Consumer implements Runnable {
	QueueResource queueResource;
	Consumer(QueueResource queueResource) {
	    this.queueResource = queueResource;
	    new Thread(this, "Consumer").start();
	}
	public void run() {
	    while(true) {
	    	queueResource.get();
	    } 
    
	}
}
