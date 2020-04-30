package com.ksk.creational.abstractfactory;

public class Computer {

	private Cpu _cpu;
	private Memory _memory;


	@Override
	public String toString() {
		return "Computer [_cpu=" + _cpu + ", _memory=" + _memory + "]";
	}

	public void add(Cpu cpu) {
		_cpu = cpu;
		
	}
	
	public void add(Memory memory) {
		_memory = memory;
		
	}

}
