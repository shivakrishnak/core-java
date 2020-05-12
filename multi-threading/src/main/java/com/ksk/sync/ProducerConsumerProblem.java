package com.ksk.sync;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerProblem {
	private List<Integer> list = new ArrayList<>();
	private final int LIMIT = 5;
	private final int BOTTOM = 0;
	private final Object lock = new Object();
	private int value = 0;

	public void producer() throws InterruptedException {
		synchronized (lock) {
			while (true) {
				if (list.size() == LIMIT) {
					System.out.println("Waiting for items to be removed....");
					lock.wait();
				} else {
					list.add(value);
					System.out.println("Value added is " + value);
					value++;
					lock.notify();
				}
				Thread.sleep(500);
			}

		}
	}

	public void consumer() throws InterruptedException {
		synchronized (lock) {
			while (true) {
				if (list.size() == BOTTOM) {
					System.out.println("Waiting for items to be added....");
					lock.wait();
				} else {
					System.out.println("Value removed is " + list.remove(--value));
					lock.notify();
				}
				Thread.sleep(500);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ProducerConsumerProblem pc = new ProducerConsumerProblem();
		Thread t1 = new Thread(() -> {
			try {
				pc.producer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread t2 = new Thread(() -> {
			try {
				pc.consumer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

}
