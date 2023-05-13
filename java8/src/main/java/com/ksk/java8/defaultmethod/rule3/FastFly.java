package com.ksk.java8.defaultmethod.rule3;

interface FastFly extends Fly{
    default void cruise(){
        System.out.println("FlyStan:cruise");
    }
}