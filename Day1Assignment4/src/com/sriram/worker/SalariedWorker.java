package com.sriram.worker;

public class SalariedWorker extends Worker{
	int hours;

	public SalariedWorker(String name, int salaryRate, int hours) {
		super(name, salaryRate);
		this.hours = hours;
	}
	
	public float pay() {
		int weeks=hours/(24*7);
		return 40*weeks;
	}

}

