package com.ksk.java8.defaultmethod.rule3;

public class DefaultMethod3{
    public static void main(String[] args) {
        System.out.println("Okay");
        SeaPlane plane = new SeaPlane();
        plane.fly();
        plane.cruise();
        plane.takeOff();
    }
}