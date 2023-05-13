package com.ksk.java8.defaultmethod.interf;

public interface InterfaceA {
    public default void method(){
        System.out.println("method from Interface A");
    }

    public String toString();
    public int hashCode();
}
