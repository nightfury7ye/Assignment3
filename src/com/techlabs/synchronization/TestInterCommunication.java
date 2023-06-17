package com.techlabs.synchronization;

public class TestInterCommunication {

	public static void main(String[] args) {
		QueueResource queueResource = new QueueResource();
	    new Producer(queueResource);
	    new Consumer(queueResource);
	    System.out.println("Press Control-C to stop.");

	}

}
