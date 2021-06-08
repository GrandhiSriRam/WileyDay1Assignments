package com.sriram;

import java.util.Set;
import java.util.TreeMap;

public class Directory {
	
//	private String name;
//	private String phone;
	TreeMap<String,String>directory;
	
	public String getPhone(String name) {
		Set<String>names=directory.keySet();
		if(!names.contains(name)) {
			return "Sorry! phone number not available";
		}
		return directory.get(name);
	}
	
	public TreeMap<String, String> getDirectory() {
		return directory;
	}
	public Directory() {
		 directory=new TreeMap<>();
	}
	public void addEntry(String name, String number) {
		directory.put(name, number);
	}
	public void display() {
	    Set<String>names=directory.keySet();
	    for(String x:names)
	        System.out.println(x+" : " +directory.get(x));
	}
}
