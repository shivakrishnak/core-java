package com.ksk.java8.defaultmethod.rule1;

interface Fly{
    default void fly(){
        System.out.println("Fly:fly");
    }
    default void cruise(){
        System.out.println("Fly:cruise");
    }
    default void takeOff(){
        System.out.println("Fly:takeOff");
    }
    default void steer(){
        System.out.println("Fly:steer");
    }
}