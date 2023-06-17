package com.techlabs.executorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable2 {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		List<CallableThread> myThread = new ArrayList<CallableThread>();
		myThread.add(new CallableThread());
		myThread.add(new CallableThread());
		myThread.add(new CallableThread());
		myThread.add(new CallableThread());
		try {
		List<Future<String>> futures = service.invokeAll(myThread);
//		service.execute(myThread);
		System.out.println("A sent");
		for(Future<String> future: futures) {
			System.out.println("Is Done: "+ future.isDone());
			System.out.println(future.get());
			System.out.println("Is Done: "+ future.isDone());
		}
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		service.shutdown();

	}

}
