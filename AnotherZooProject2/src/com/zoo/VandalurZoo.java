package com.zoo;



import java.util.ArrayList;
import java.util.List;

import com.animals.*;
public class VandalurZoo {
	List<Animal>animals=new ArrayList<>();
	public void setAnimals(ArrayList<Animal>list) {
		animals=list;
	}
	public void displayZoo() {
		for(Animal animal:animals) {
			System.out.println(animal.getColor()+" "+animal.getAge()+" "+animal.getWeight()+" ");
		}
	}
}
