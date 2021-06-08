package com.sriram.assignment1;

public class EggClass {
	private int eggs;
	private EggUnit converted;

	public void setEggs(int eggs) {
		this.eggs = eggs;
	}

	public EggUnit calculateEggs() {
		int gross=eggs/144;
		int dozens=(eggs%144)/12;
		int remaining=(eggs%14)%12;
		EggUnit ans  = new EggUnit(gross,dozens,remaining);
		ans.setDozen(dozens);
		ans.setGross(gross);
		ans.setRemaining(remaining);
		return ans;
	}
}
