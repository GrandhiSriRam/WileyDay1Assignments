package com.sriram;

public class ThreadExerciseMain{
	public static void main(String args[]) throws InterruptedException {
		ThreadExercise thread1=new ThreadExercise("thread1");
		ThreadExercise thread2=new ThreadExercise("thread2");
		ThreadExercise thread3=new ThreadExercise("thread3");
		ThreadExercise thread4=new ThreadExercise("thread4");
		
		thread1.start();
		thread1.sleep(1000);
		thread2.start();
		thread2.sleep(1000);
		thread3.start();
		thread3.sleep(1000);
		thread4.start();
		thread4.sleep(1000);
		
		
		
	}
}
