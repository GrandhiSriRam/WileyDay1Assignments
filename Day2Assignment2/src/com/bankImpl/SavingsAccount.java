package com.bankImpl;
import com.bank.*;
public class SavingsAccount implements DepositAcc,CreditInterest{

	@Override
	public void addMonthly() {
		// TODO Auto-generated method stub
		System.out.println("This is savings account monthly addition");
	}

	@Override
	public void addHalfYrlyInt() {
		// TODO Auto-generated method stub
		System.out.println("This is savings account half yearly addition");
	}

	@Override
	public void addAnnualInt() {
		// TODO Auto-generated method stub
		System.out.println("This is savings account annual addition");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("This is savings account withdraw");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("This is savings account deposit");
	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("This is savings account balance");
	}

	@Override
	public void createacc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcInt() {
		// TODO Auto-generated method stub
		
	}
	
}
