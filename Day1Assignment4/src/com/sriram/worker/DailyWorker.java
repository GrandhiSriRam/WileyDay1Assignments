package com.sriram.worker;

public class DailyWorker extends Worker{
	
	private int hours;
	
	public DailyWorker(String name, int salaryRate, int hours) {
		super(name, salaryRate);
		this.hours = hours;
	}

	public float pay() {
		
		int days=hours/24;
		return salaryRate*days;
		
	}
}
