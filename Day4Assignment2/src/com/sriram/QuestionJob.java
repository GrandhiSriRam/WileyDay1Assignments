package com.sriram;

public class QuestionJob implements Runnable{
	
	private UserQuestionAnswer user;
	private String[] questions= {"What is the capital of India ?","Who is our Prime minister ?","Is cow a mammal ?"
			,"How many days a week have ?","What is the color of sky?"};
	
	QuestionJob(UserQuestionAnswer u){
		super();
		user=u;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			user.showQuestion(questions[i-1],i);
			
		}
		
	}	
}
