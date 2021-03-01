package com.ksk.creational;

/**
 * Definition: Singleton pattern ensures a class that only one instance, and provides a global point to access to it
 *
 * When to Use: When you need to ensure you only have one instance of a class running around your application, turn to singleton
 *
 */
public class SingletonPattern {
    public static void main(String[] args) {
        SingletonClass single = SingletonClass.getInstance();
    }
}

class SingletonClass {
    //volatile ensures that multiple threads handle the uniqueInstance varible correctly when it is being initialized to the singleton instance
    private volatile static SingletonClass SINGLE_INSTANCE = null;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (SINGLE_INSTANCE == null) { // Two threads can get into synchronized block concurrently; while first thread exist the synchronized block, the waiting thread enters and creates another singleton object
            synchronized (SingletonClass.class) {
                // double checked locking
                if (SINGLE_INSTANCE == null) {
                    SINGLE_INSTANCE = new SingletonClass();
                }
            }
        }
        return SINGLE_INSTANCE;
    }
}
