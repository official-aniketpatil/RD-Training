package com.epam.collection_task;

import java.util.Scanner;

import com.epam.exceptions.IllegalMatrixException;
import com.epam.model.Matrix;

class Input {
	private Scanner scanner;
	
	public Input(){
		scanner = new Scanner(System.in);
	}
	public int[] getArray(){	
		System.out.println("Enter number of elements in array");
		int length = scanner.nextInt();
		int[] elements = new int[length];
		
		for(int i = 0; i < length; i++) {
			elements[i] = scanner.nextInt();
		}
		
		return elements;
	}
	public Matrix getSquareMatrix() throws IllegalMatrixException{
		System.out.println("Enter number of rows and colums");
		int rows = scanner.nextInt();
		int columns = scanner.nextInt();
		if(rows != columns) {
			throw new IllegalMatrixException("Number of rows must equal to columns");
		}
		int[][]  matrix = new int[rows][columns]; 
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		return new Matrix(matrix, rows, columns);
	}
	public int getInteger() {
		return scanner.nextInt();
	}
	public String getString() {
		return scanner.next().trim();
	}
}