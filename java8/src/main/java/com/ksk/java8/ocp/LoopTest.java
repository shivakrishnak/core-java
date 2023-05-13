package com.ksk.java8.ocp;

public class LoopTest {
    public static void main(String[] args) {
        int i = 0;
        //int sum; //need to be initialized
        int sum = 0;
        for (;i<3;i++){
            sum += ++i;
        }
    }
}
