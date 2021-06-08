package com.sriram.inter;

public class Line implements Drawable,Fillable{

	@Override
	public void fillingColor() {
		// TODO Auto-generated method stub
		System.out.println("Filling line");
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("Line size");
	}

	@Override
	public void drawingColor() {
		// TODO Auto-generated method stub
		System.out.println("drawing line");
	}

	@Override
	public void thickness() {
		// TODO Auto-generated method stub
		System.out.println("thickness of line");
	}
	
}
