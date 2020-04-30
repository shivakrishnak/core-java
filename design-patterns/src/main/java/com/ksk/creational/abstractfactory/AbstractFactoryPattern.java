package com.ksk.creational.abstractfactory;

/**
 * Definition: Provide an interface for creating families of related or dependent objects
 * without specifying their concrete classes
 * 
 * When to Use: System should be independent of how its products are created, composed and represented
 *
 */
public class AbstractFactoryPattern 
{
	
    public static void main( String[] args )
    {
        Computer computer1 = new ComputerA();
        //createComputer(computer1);
        createComputer(computer1, new ComputerFactoryA());
        System.out.println(computer1);
        
        Computer computer2 = new ComputerB();
        //createComputer(computer2);
        createComputer(computer2, new ComputerFactoryB());
        System.out.println(computer2);
    }
    
    private static void createComputer(Computer computer, ComputerFactory factory) {

    	computer.add(factory.getCPU());
    	computer.add(factory.getMemory());
	}

//Violates Open-Close Principle
//	private static void createComputer(Computer computer) {
//		if(computer instanceof ComputerA) {
//			computer.add(new CpuA());
//			computer.add(new MemoryA());
//		} else {
//			computer.add(new CpuB());
//			computer.add(new MemoryB());
//		}
//	}
	
//Violated DRY principle
//	private static void createComputer(ComputerA computer) {
//
//		computer.add(new CpuA());
//		computer.add(new MemoryA());
//	}
//	
//	private static void createComputer(ComputerB computer) {
//
//		computer.add(new CpuB());
//		computer.add(new MemoryB());
//	}
}
