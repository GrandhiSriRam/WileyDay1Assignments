package com.sriram.inter;

public class Circle implements Drawable, Fillable{

	@Override
	public void fillingColor() {
		// TODO Auto-generated method stub
		System.out.println("Filling Circle");
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("Circle size");
	}

	@Override
	public void drawingColor() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle");
	}

	@Override
	public void thickness() {
		// TODO Auto-generated method stub
		System.out.println("Circle thickness");
	}
	
}
