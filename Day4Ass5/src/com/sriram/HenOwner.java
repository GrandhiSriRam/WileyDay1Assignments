package com.sriram;

public class HenOwner {
	private int flag=1;
	synchronized void henLaysEgg(int i) {
		if(flag==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" "+"layed the egg "+i);
		flag=0;
		notify();
	}
	synchronized void ownerMakesMoney(int i) {
		if(flag==1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" "+"gained Rs "+i);
		flag=1;
		notify();
	}
}
