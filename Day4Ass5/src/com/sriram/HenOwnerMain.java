package com.sriram;

public class HenOwnerMain {

	public static void main(String[] args) {
		HenOwner h=new HenOwner();
		Thread thread1=new Thread(new HenJob(h), "Hen ");
		Thread thread2=new Thread(new OwnerJob(h), "Owner ");
		
		thread1.start();
		thread2.start();
	}

}
