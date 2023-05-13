package com.ksk.java8.ocp.inhert;

public class ConBase {
    public ConBase(){
        this(2);
        System.out.println(3);
    }

    public ConBase(int i) {
        System.out.println(i);
    }
}
