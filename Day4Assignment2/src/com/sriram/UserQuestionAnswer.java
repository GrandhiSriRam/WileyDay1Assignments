package com.sriram;

public class UserQuestionAnswer {
	private int flag=0;
	synchronized void showQuestion(String ques,int i) {
		if(flag==1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+""+i+":"+ques);
		flag=1;
		notify();
	}
	
	synchronized void showAnswer(String ans,int i) {
		if(flag==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Your answer is correct.");
		flag=0;
		notify();
	}
	
}
