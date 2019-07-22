package com.epam.fundamentals;


public class CollatzSequence {

	static boolean isEven(int num) {
		
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}
	static void printSequence(int num) {
		
		System.out.print(num + " ");
		
		if (num == 1) {
			return;
		} else if (isEven(num)) {
			printSequence(num/2);
		} else {
			printSequence(3*num+1);
		}
	}
	public static void main(String[] args) {
		int initialSequenceNumber=Integer.parseInt(args[0]);
		
		printSequence(initialSequenceNumber);
	}

}
