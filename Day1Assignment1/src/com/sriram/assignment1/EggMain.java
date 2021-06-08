package com.sriram.assignment1;

import java.util.Scanner;

public class EggMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int eggs=scanner.nextInt();
		EggClass egg=new EggClass();
		egg.setEggs(eggs);
		EggUnit result = egg.calculateEggs();
		scanner.close();
		System.out.print(result.getGross()+" "+result.getDozen()+" "+result.getRemaining());
	}

}
