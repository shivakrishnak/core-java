package com.ksk.sync;

class Processor {

	public void produce() throws InterruptedException{
		synchronized (this) {
			System.out.println("In Producer Method...");
			wait();
			//wait(5000);
			System.out.println("Again producer method");
		}
	}
	
	public void producer() throws InterruptedException{
		synchronized (this) {
			System.out.println("Second Producer Method...");
			wait();
			//wait(5000);
			System.out.println("Second producer method");
		}
	}
	
	public void consume() throws InterruptedException{
		Thread.sleep(1000);
		synchronized (this) {
			System.out.println("Consumer method...");
			//notify();
			notifyAll();
			Thread.sleep(1000);
		}
	}
}

public class WaitNotify {

	public static void main(String[] args) {
		Processor process = new Processor();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					process.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t = new Thread(new Runnable() {
			public void run() {
				try {
					process.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					process.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t.start();
		t2.start();
		try {
			t1.join();
			t2.join();
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
