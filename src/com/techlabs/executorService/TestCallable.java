package com.techlabs.executorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(5);
		CallableThread myThread= new CallableThread();
		Future<?> future = service.submit(myThread);
//		service.execute(myThread);
		
		System.out.println("Is Done: "+ future.isDone());
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Is Done: "+ future.isDone());

	}

}
