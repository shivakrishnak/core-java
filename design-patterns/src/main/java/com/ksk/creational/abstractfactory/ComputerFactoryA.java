package com.ksk.creational.abstractfactory;

public class ComputerFactoryA extends ComputerFactory {

	@Override
	public Cpu getCPU() {
		return new CpuA();
	}

	@Override
	public Memory getMemory() {
		return new MemoryA();
	}

}
