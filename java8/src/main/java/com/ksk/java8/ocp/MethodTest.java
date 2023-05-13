package com.ksk.java8.ocp;

public class MethodTest {
    static String prefix = "shiva";
    private String name = "krishna";

    public String getName() {
        return new MethodTest().name;
    }

    public static void main(String[] args) {
        //System.out.println(prefix +":" + name);
        //System.out.println(prefix +":" + getName());
        System.out.println(prefix + ":" + new MethodTest().name);
        System.out.println(MethodTest.prefix + ":" + new MethodTest().name);
        System.out.println(new MethodTest().prefix + ":" + new MethodTest().name);
        System.out.println(prefix + ":" + new MethodTest().getName());
    }
}
