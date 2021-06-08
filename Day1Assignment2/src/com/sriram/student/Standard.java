package com.sriram.student;

import java.util.Scanner;

public class Standard {
	Scanner sc=new Scanner(System.in);
	Student students[];
	Standard(){
			students=new Student[8];
			for(int i=0;i<8;i++) {
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter marks in Maths");
			int maths=sc.nextInt();
			System.out.println("Enter marks in English");
			int eng=sc.nextInt();
			System.out.println("Enter marks in Science");
			int sci=sc.nextInt();
			students[i]=new Student(i+101,name,eng,maths,sci);
		}
	}
	public void highestPercent() {
		double percentages[]=new double[8];
		double max=Integer.MIN_VALUE;
		int index=-1;
		for(int i=0;i<8;i++) {
			int totalMarks=0;
			totalMarks+=students[i].getMarksInEnglish()+students[i].getMarksInMaths()+students[i].getMarksInScience();
			percentages[i]=totalMarks/3.0;
			if(percentages[i]>max) {
				max=percentages[i];
				index=i;
			}
		}
		System.out.println("The student with highest percentage is :");
		System.out.println(students[index].getRollNo()+" "+students[index].getName());
	}
	public void mathematics() {
		int index=-1,max=Integer.MIN_VALUE;
		for(int i=0;i<8;i++) {
			if(students[i].getMarksInMaths()>max) {
				max=students[i].getMarksInMaths();
				index=i;
			}
		}
		System.out.println("The student with highest mathematics marks is : ");
		System.out.println(students[index].getRollNo()+" "+students[index].getName());
	}

}
