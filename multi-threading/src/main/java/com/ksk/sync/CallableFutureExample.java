package com.ksk.sync;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CProcessor implements Callable<String> {

	private int id;

	public CProcessor(int id) {
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "id " + id;
	}

}

public class CallableFutureExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService execService = Executors.newFixedThreadPool(2);
		List<Future<String>> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			Future<String> future = execService.submit(new CProcessor(i + 1));
			list.add(future);
		}

		for (Future<String> future : list) {
			System.out.println(future.get());
		}

		execService.shutdown();
	}
}
