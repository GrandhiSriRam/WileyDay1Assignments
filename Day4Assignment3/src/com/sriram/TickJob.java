package com.sriram;

public class TickJob implements Runnable{
	private Clock clock;
	
	public TickJob(Clock clock) {
		super();
		this.clock=clock;
	}

	
	public void run() {
		for(int i=1;i<=60;i++) {
			clock.printTick(i);
		}
	}
	
}
