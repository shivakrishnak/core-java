package com.ksk.java8.ocp.overload;

class Calculator {
    public static long add(int a, long... b) {
        System.out.println("int a, Var args long b");
        int total = a;
        for (long val : b) {
            total += val;
        }
        return total;
    }

    public static long add(int a, Long b) {
        System.out.println("int + Long");
        return a + b;
    }
}

public class OverloadTests {
    public static void main(String[] args) {
        long result = Calculator.add(1, 2);
        System.out.println("result = " + result);
        Long l = 0L;
        long test = true ? 2 : l;
        long result2 = Calculator.add(1, true ? 2 : l);

        Integer i = 2;
        long test2 = true ? i : l;
        long result3 = Calculator.add(1, true ? i : l);
    }
}