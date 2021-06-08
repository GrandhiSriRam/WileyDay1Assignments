package com.sriram.worker;

public class WorkerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker dailyWorker=new DailyWorker("raju",50,70);
		Worker salariedworker=new SalariedWorker("ramu",100,200);
		System.out.println(dailyWorker.pay());
		System.out.println(salariedworker.pay());
	}

}
