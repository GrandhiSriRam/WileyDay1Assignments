package com.sriram;

class ThreadExercise extends Thread{
	ThreadExercise(String name){
		super(name);
	}
	public void run() {
		Thread t=Thread.currentThread();
		for(int i=0;i<5;i++) {
			System.out.println(t.getId()+" "+t.getName()+" "+t.isAlive()+" "+t.getState()+" "+t.getPriority());
		}
	}
}

