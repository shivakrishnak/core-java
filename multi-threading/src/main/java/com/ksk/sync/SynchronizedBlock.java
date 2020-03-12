package com.ksk.sync;

import com.ksk.App;

public class SynchronizedBlock {

	public static int count1 = 0;
	public static int count2 = 0;
	
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
	
//	//Intrinsic lock will be applied to whole class
//	public static void add() {
//		synchronized (App.class) {
//			++count1;
//		}
//	}

	public static void add() {
		synchronized (lock1) {
			++count1;
		}
	}

	public static void addAgain() {
		synchronized (lock2) {
			++count2;
		}
	}

	public static void compute() {
		for (int i = 0; i < 1000; i++) {
			add();
			addAgain();
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				compute();
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				compute();
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
		System.out.println("Count1 " + count1);
		System.out.println("Count2 " + count2);
	}
}
