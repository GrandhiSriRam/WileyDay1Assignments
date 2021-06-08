package com.sriram.student;

public class Student {
	private int rollNo;
	private String name;
	private int marksInEnglish;
	private int marksInMaths;
	private int marksInScience;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarksInEnglish() {
		return marksInEnglish;
	}
	public void setMarksInEnglish(int marksInEnglish) {
		this.marksInEnglish = marksInEnglish;
	}
	public int getMarksInMaths() {
		return marksInMaths;
	}
	public void setMarksInMaths(int marksInMaths) {
		this.marksInMaths = marksInMaths;
	}
	public int getMarksInScience() {
		return marksInScience;
	}
	public void setMarksInScience(int marksInScience) {
		this.marksInScience = marksInScience;
	}
	public Student(int rollNo, String name, int marksInEnglish, int marksInMaths, int marksInScience) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marksInEnglish = marksInEnglish;
		this.marksInMaths = marksInMaths;
		this.marksInScience = marksInScience;
	}
	
}
