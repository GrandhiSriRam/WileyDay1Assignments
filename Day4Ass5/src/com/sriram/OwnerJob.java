package com.sriram;

public class OwnerJob implements Runnable{
	private HenOwner ho;
	OwnerJob(HenOwner ho){
		super();
		this.ho=ho;
	}
	@Override
	public void run() {
		for(int i=2;i<=100;i+=2) {
			ho.ownerMakesMoney(i);
		}	
	}
}
