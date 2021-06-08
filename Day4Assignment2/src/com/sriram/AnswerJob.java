package com.sriram;

import java.util.Scanner;

public class AnswerJob implements Runnable{
	private UserQuestionAnswer user;
	Scanner sc=new Scanner(System.in);
	private String[] answers= {"New Delhi", "Narendra Modi", "Yes","7","blue"};
	
	
	AnswerJob(UserQuestionAnswer u){
		super();
		user=u;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.currentThread().sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String ans=sc.nextLine();
			if(ans.equalsIgnoreCase(answers[i-1]))
				user.showAnswer(answers[i-1],i);
			else 
				System.exit(0);
		}
		
	}
}
