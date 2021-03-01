### Creational Patterns


#### Singleton Pattern
Definition: Singleton pattern ensures a class that only one instance, and provides a global point to access to it

When to Use: When you need to ensure you only have one instance of a class running around your application, turn to singleton

> Best way to create a singleton is by using ENUM

Applications : Logging, configuration, caching


Java core library: Singleton (recognizeable by creational methods returning the same instance (usually of itself) everytime)
> java.lang.Runtime#getRuntime()

> java.awt.Desktop#getDesktop()

> java.lang.System#getSecurityManager()

Disadvantages :
- We can still create multiple instances of the above implementations by using serialization or reflection
- cloning
- Classloaders - If the Singleton class is loaded by 2 different class loaders we'll have 2 different classes, one for each class loader

How to prevent cloning of Singleton object? 
> Well, we can throw an exception from the clone method of the Singleton class.

How to prevent duplicate instance via Serialization/Deserialization of Singleton?
> We have to override/implement the readobject() method and have to return the same singleton instance of the class. Otherwiase, Implement SingletonClass as enum; 

````
//volatile ensures that multiple threads handle the uniqueInstance varible correctly when it is being initialized to the singleton instance
private volatile static SingletonClass SINGLE_INSTANCE = null;

// Two threads can get into synchronized block concurrently; while first thread exist the synchronized block, the waiting thread enters and creates another singleton object, so double checked locking is used
if (SINGLE_INSTANCE == null) { 
	synchronized (SingletonClass.class) {
		// double checked locking
		if (SINGLE_INSTANCE == null) {
			SINGLE_INSTANCE = new SingletonClass();
		}
	}
}

//singleton class by using enums since enums fields are compiled time constants
public enum SingletonClass {
    SINGLE_INSTANCE;
}
````


#### Builder Pattern
- Seperates the construction of complex object from its representation, so that the same construction process can create different representation