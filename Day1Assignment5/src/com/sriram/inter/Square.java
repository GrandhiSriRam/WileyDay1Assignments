package com.sriram.inter;

public class Square implements Fillable, Drawable{
	@Override
	public void fillingColor() {
		// TODO Auto-generated method stub
		System.out.println("Filling Square");
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("Square size");
	}

	@Override
	public void drawingColor() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Square");
	}

	@Override
	public void thickness() {
		// TODO Auto-generated method stub
		System.out.println("Square thickness");
	}
}
