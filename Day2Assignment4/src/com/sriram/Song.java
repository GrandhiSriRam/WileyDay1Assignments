package com.sriram;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class Song{
	
	private String title;
	private String singer;
	private TreeMap<String,String>tm;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public Song() {
		tm=new TreeMap<>();
	}
	public void addEntry(String title, String singer) {
		tm.put(title, singer);
	}
	
	public void display() {
		CompByName ob=new CompByName();
		Map Sorted = ob.valueSort(tm);
		Set<String>set=Sorted.keySet();
		for(String x:set) {
			System.out.println(x+" : "+tm.get(x));
		}
	}
}
