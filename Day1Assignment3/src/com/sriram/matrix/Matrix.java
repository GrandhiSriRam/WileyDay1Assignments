package com.sriram.matrix;

import java.util.Scanner;

public class Matrix {
	
	private int rows,columns;
	
	private int [][] array;
	
	Matrix(int rows,int cols){
		array=new int[rows][cols];
	}
	Matrix() {
		
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public void setArray(int [][]array) {
		this.array=array;
	}
	public Matrix add(Matrix m1) {
		Matrix m3=new Matrix();
		int result[][]=new int[m1.getRows()][m1.getColumns()];
		for(int i=0;i<m1.getRows();i++) {
			for(int j=0;j<m1.getColumns();j++) {
				result[i][j]=this.array[i][j]+m1.array[i][j];
			}
		}
		m3.setArray(result);
		m3.setRows(result.length);
		m3.setColumns(result[0].length);
		return m3;
	}
	public void display() {
		for(int i=0;i<this.array.length;i++) {
			for(int j=0;j<this.array[0].length;j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		
	}
}
