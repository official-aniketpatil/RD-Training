package com.epam.model;

import com.epam.exceptions.IllegalMatrixException;

public class Matrix {
 private int[][] matrix;
 private int rows;
 private int columns;
 
 public Matrix(int[][] matrix, int rows, int columns){
	 this.matrix = matrix;
	 this.rows = rows;
	 this.columns = columns; 
 }
 public int getRows() {
	 return rows;
 }
 public int getColumns() {
	 return columns;
 }
 public int[][] getMatrix(){
	 return matrix;
 }
 public int getElement(int i, int j) {
	 return matrix[i][j];
 }
 public boolean isSquareMatrix() {
	 if(rows == columns) {
		 return true;
	 }
	 return false;
 }
 
}
