package com.ksk.basics.Runnable;

class Runner1 implements Runnable {

	public void startRunning() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runner1 :" + i);
		}
	}

	@Override
	public void run() {
		startRunning();
	}
}

class Runner2  implements Runnable{

	public void startRunning() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runner2 :" + i);
		}
	}

	@Override
	public void run() {
		startRunning();
	}
}

public class App {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner1());
		Thread t2 = new Thread(new Runner2());

		t1.start();
		t2.start();
	}
}
