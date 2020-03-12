package com.ksk.sync;


public class SynchronizedMethod {
	
	public static int counter = 0;
	
	public static synchronized void increment() {
		++counter;
	}
	
//	//this method will give random value
//	public static void increment() {
//		++counter;
//	}
	
	public static void process() {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100000; i++) {
					increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100000; i++) {
					increment();
				}
			}
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		process();
		System.out.println(counter);
		
	}
}
