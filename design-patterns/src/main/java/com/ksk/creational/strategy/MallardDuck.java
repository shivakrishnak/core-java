package com.ksk.creational.strategy;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}

	@Override
	void display() {
	System.out.println("Mallard Duck Displayed....");
	}

}
