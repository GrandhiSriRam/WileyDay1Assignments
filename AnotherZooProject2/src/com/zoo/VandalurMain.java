package com.zoo;

import java.util.ArrayList;

import com.animals.*;

public class VandalurMain {

	public static void main(String[] args) {
		
		ArrayList<Animal>arr=new ArrayList<>();
		arr.add(new Lion(200,30,"yellow"));
		arr.add(new Tiger(100,20,"brown"));
		arr.add(new Deer(10,20,"Golden"));
		VandalurZoo v=new VandalurZoo();
		v.setAnimals(arr);
		v.displayZoo();
	}

}
