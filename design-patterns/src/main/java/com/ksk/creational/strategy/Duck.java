package com.ksk.creational.strategy;

public abstract class Duck {

	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	abstract void display();
	
	public Duck() {
		
	}
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void swim() {
		System.out.println("Ducks Swimming.....");
	}
}
 