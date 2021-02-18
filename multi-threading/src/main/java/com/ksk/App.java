package com.ksk;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        A a = new A();
        a.wait();
        System.out.println( "wait" );
        a.notify();
        System.out.println( "notify" );
    }
}

class A implements Runnable{

	@Override
	public void run() {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread running");
		
	}
	
}