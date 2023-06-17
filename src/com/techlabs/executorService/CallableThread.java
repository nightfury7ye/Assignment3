package com.techlabs.executorService;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(2000);
		return "Executor execute Callable";
	}

}
