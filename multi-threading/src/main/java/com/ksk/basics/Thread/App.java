package com.ksk.basics.Thread;

class Runner1 extends Thread {

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

class Runner2  extends Thread{

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
		Thread t1 = new Runner1();
		Thread t2 = new Runner2();

		t1.start();
		t2.start();
	}
}
