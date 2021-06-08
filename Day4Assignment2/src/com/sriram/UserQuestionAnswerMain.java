package com.sriram;

public class UserQuestionAnswerMain {

	public static void main(String[] args) throws InterruptedException {
		UserQuestionAnswer obj=new UserQuestionAnswer();
		
		Thread t1=new Thread(new QuestionJob(obj),"question ");
		Thread t2=new Thread(new AnswerJob(obj),"answer ");
		
		t1.start();
		t2.start();

	}

}
