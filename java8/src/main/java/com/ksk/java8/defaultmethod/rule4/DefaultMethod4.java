package com.ksk.java8.defaultmethod.rule4;

public class DefaultMethod4{
    public static void main(String[] args) {
        System.out.println("Okay");
        SeaPlane plane = new SeaPlane();
        plane.fly();
        plane.cruise();
        plane.takeOff();
        plane.steer();
    }
}