package com.ksk.ocp.inhert;

public class ConSub extends ConBase{
    public ConSub(){
        this(4);
        System.out.println(5);
    }

    public ConSub(int x) {
        System.out.println(x);
    }
}
