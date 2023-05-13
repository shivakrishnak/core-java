package com.ksk.java8.ocp;

public class IntShadowTest {
    static int myInt = 3;

    public static void main(String[] args) {
        int myInts = myInt;
        //System.out.println(myInt);
    }
}
