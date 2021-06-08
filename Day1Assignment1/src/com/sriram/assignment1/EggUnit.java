package com.sriram.assignment1;

public class EggUnit {
	public int gross,dozen,remaining;
	
	public int getGross() {
		return gross;
	}

	public void setGross(int gross) {
		this.gross = gross;
	}

	public int getDozen() {
		return dozen;
	}

	public void setDozen(int dozen) {
		this.dozen = dozen;
	}

	public int getRemaining() {
		return remaining;
	}

	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}

	public EggUnit(int gross, int dozen, int remaining) {
		super();
		this.gross = gross;
		this.dozen = dozen;
		this.remaining = remaining;
	}
	
}
