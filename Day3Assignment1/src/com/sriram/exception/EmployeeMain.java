package com.sriram.exception;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		AddEmployee obj=new AddEmployee();
		while(true) {
				System.out.println("Enter the name of the employee");
				String name=sc.next();
				System.out.println("Enter the age of employee");
				int age=sc.nextInt();
				obj.addEmployee(name, age);
				System.out.println("Please enter 0 to exit");
				int exit=sc.nextInt();
				if(exit==0) {
					sc.close();
					System.exit(0);
				}
		}
	}
}
