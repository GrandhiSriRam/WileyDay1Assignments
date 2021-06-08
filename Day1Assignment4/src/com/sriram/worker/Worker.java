package com.sriram.worker;

public abstract class Worker {
	private String name;
	protected int salaryRate;
	
	
    public Worker(String name, int salaryRate) {
		super();
		this.name = name;
		this.salaryRate = salaryRate;
	}
    
    abstract float pay();
}
