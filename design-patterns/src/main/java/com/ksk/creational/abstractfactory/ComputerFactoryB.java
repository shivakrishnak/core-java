package com.ksk.creational.abstractfactory;

public class ComputerFactoryB extends ComputerFactory {

	@Override
	public Cpu getCPU() {
		return new CpuB();
	}

	@Override
	public Memory getMemory() {
		return new MemoryB();
	}

}
