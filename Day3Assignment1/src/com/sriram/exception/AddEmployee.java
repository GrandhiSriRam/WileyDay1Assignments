package com.sriram.exception;

import java.util.ArrayList;

public class AddEmployee {
	ArrayList<Employee>emp;
	AddEmployee(){
		emp  = new ArrayList<>();
	}
	public void addEmployee(String name,int age) {
		try {
			for(int i=0;i<emp.size();i++) {
				if(emp.get(i).getName().equals(name)) {
					throw new DuplicateNameException();
				}
			}
		}
		catch(DuplicateNameException exception) {
			System.out.println("Name is already present"+exception);
			//exception.printStackTrace();
		}
		try {
			if(age<18 || age>60) {
				throw new AgeNotValidException();
			}
		}
		catch (AgeNotValidException e) {
			System.out.println("Age is not valid"+e);
		}
		emp.add(new Employee(name,age));
		//System.out.println(emp);
	}

}
