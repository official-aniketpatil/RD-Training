package com.epam.collection_task;

import java.util.Scanner;

class Helper {
	
	public void runApplication() {
		Input input = new Input();
		int[] elements = input.getArray();
		SumAndAverage sumAndAverage = new SumAndAverage(elements);
		
		System.out.println("sum of Array is "+sumAndAverage.getSum());
		System.out.println("Average of Array is "+sumAndAverage.getAverage());
	}
	
}
public class SumAndAverage {
    private int[] elements;
    private int sum;
    private double average;
     
    public SumAndAverage(int[] elements){
    	this.elements = elements;
    	this.sum = this.calculateSum();
    	this.average = this.calculateAverage();
    }
     
    public int[] getElements() {
    	return elements;
    } 
    public int getSum() {
		return sum;
	}
	public double getAverage() {
		return average;
	}
	public float calculateAverage() {
	   	int length = elements.length;
	   	
	   	return getSum() / length;
	}
	public int calculateSum() {
		int sum=0;
		for(int element : elements) {
			sum += element;
		}
		return sum;
	}
	public static void main(String[] args) {
		Helper helper =  new Helper();
		helper.runApplication();
	}	

}
