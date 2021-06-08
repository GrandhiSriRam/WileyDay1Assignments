package com.sriram;

public class Clock {
	private int flag=0;
	synchronized void printTick(int i) {
		while(flag!=0) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print(Thread.currentThread().getName()+" "+i);
		flag=1;
		notifyAll();
		
	}
	synchronized void printTack(int i) {
		while(flag!=1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print(Thread.currentThread().getName()+" "+i);
		flag=2;
		notifyAll();
	}
	synchronized void printTock(int i) {
		while(flag!=2) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print(Thread.currentThread().getName()+" "+i);
		flag=0;
		notifyAll();
	}

}
