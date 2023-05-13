package com.ksk.java8.defaultmethod.rule4;

interface FastFly extends Fly{
    default void cruise(){
        System.out.println("FlyStan:cruise");
    }
    default void steer(){
        System.out.println("FastFly:steer");
    }
}