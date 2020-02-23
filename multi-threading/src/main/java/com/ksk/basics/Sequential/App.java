package com.ksk.basics.Sequential;

class Runner1 {

	public void startRunning() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runner1 :" + i);
		}
	}
}

class Runner2 {

	public void startRunning() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runner2 :" + i);
		}
	}
}

public class App {

	public static void main(String[] args) {
		Runner1 run1 = new Runner1();
		Runner2 run2 = new Runner2();

		run1.startRunning();
		run2.startRunning();
	}
}
