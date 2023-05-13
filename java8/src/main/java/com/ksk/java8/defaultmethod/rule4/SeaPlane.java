package com.ksk.java8.defaultmethod.rule4;

class SeaPlane extends Vehicle implements FastFly,Fly{
    public void steer(){
        System.out.println("SeaPlane:steer");
    }
}