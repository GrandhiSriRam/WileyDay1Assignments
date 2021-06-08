package com.sriram;

public class TockJob implements Runnable{
	private Clock clock;
	
	public TockJob(Clock clock){
		super();
		this.clock=clock;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=60;i++) {
			clock.printTock(i);
			System.out.println();
		}
	}
}
