package com.sriram.matrix;


public class MatrixMain {

	public static void main(String[] args) {
		
		int [][]mat1= {{1,2,3},{4,5,6},{7,8,9}};
		int [][]mat2= {{1,2,3},{4,5,6},{9,9,9}};
		Matrix m1=new Matrix();
		m1.setArray(mat1);
		m1.setRows(3);
		m1.setColumns(3);
		Matrix m2=new Matrix();
		m2.setArray(mat2);
		m2.setRows(3);
		m2.setColumns(3);
		Matrix m3=m2.add(m1);
		m3.display();
		
		
	}

}
