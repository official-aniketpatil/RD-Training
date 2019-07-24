package com.epam.collection_task;

import com.epam.exceptions.IllegalMatrixException;
import com.epam.model.Matrix;

class MatrixOperationHelper{
	public void runApplication() {
		Input input = new Input();
		try {
		    Matrix matrix = input.getSquareMatrix();
		    MatrixOperation matrixOperation = new MatrixOperation(matrix);
			matrixOperation.printRowSum();
			matrixOperation.printColumnAndDiagonalSum();
		} catch(IllegalMatrixException illegalMatrixException) {
			System.out.println(illegalMatrixException.getMessage());
		}
	}
}
public class MatrixOperation {
    private  Matrix matrix;
	
    MatrixOperation(Matrix matrix){
    	this.matrix = matrix;
    }
    public int calculateDiagonalSum() {
   	 int diagonalSum = 0;
   	 
     for(int i = 0; i < matrix.getRows(); i++) {
   		diagonalSum += matrix.getElement(i, i);
   	 }
   	 return diagonalSum;
    }
    public void printRowSum() {
    	for(int i = 0; i < matrix.getRows(); i++) {
			int rowSum=0;
			for(int j = 0; j < matrix.getColumns(); j++) {
				System.out.print(matrix.getElement(i, j)+" ");
				rowSum += matrix.getElement(i, j);
			}
			System.out.print("| " + rowSum+"\n");
			rowSum = 0;
		}
    	for(int j=0; j < matrix.getColumns(); j++) {
			System.out.print("- ");
		}
    	System.out.print("/"+"\n");
    }
    public void printColumnAndDiagonalSum() {
    	for(int j = 0; j < matrix.getColumns(); j++) {
			int columnSum = 0;
			for(int i = 0; i < matrix.getRows(); i++) {
				columnSum += matrix.getElement(i, j);
			}
			System.out.print(columnSum+" ");
			columnSum = 0;
		}
		System.out.print(" "+calculateDiagonalSum());
    }
    public static void main(String[] args) {
		MatrixOperationHelper matrixOperationHelper = new MatrixOperationHelper();
		matrixOperationHelper.runApplication();
	}

}
