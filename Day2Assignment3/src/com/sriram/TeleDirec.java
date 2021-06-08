package com.sriram;

public class TeleDirec {
	
	public static void main(String args[]) {
		
		Directory d=new Directory();
		d.addEntry("Ram","9290452015");
		d.addEntry("Raju","8897821535");
		d.addEntry("Suresh","9296704016");
		d.addEntry("Abhiram","7093411112");
		d.addEntry("Yugesh","9494711112");
		d.addEntry("Bheem","08832471231");
		System.out.println(d.getPhone("Bheem"));
		System.out.println(d.getPhone("Ram"));
		System.out.println(d.getPhone("Suresh"));
		System.out.println(d.getPhone("Yugesh"));
		System.out.println(d.getPhone("hi"));
		d.display();
	}

}
