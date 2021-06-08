package com.sriram;

public class HenJob implements Runnable{
	private HenOwner ho;
	HenJob(HenOwner ho){
		super();
		this.ho=ho;
	}
	@Override
	public void run() {
		for(int i=1;i<=50;i++) {
			ho.henLaysEgg(i);
		}
		
	}
}
