package com.ksk.inheritance;

public class Child implements ParentA, ParentB {
    @Override
    public void method() {
        int a = ParentA.A;
        int b = ParentB.B;
        System.out.println(a + " " + b);
    }
}
