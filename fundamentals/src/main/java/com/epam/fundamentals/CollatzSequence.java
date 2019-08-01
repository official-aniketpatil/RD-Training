package com.epam.fundamentals;

public class CollatzSequence {

	public boolean isEven(int num) {
		
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

	public void printSequence(int num) {

		System.out.print(num + " ");

		if (num == 1) {
			return;
		} else if (isEven(num)) {
			printSequence(num / 2);
		} else {
			printSequence(3 * num + 1);
		}
	}

	public void helper(String[] args) {
		int initialSequenceNumber = Integer.parseInt(args[0]);
		printSequence(initialSequenceNumber);
	}

	public static void main(String[] args) {
		CollatzSequence collatzSequence = new CollatzSequence();
		collatzSequence.helper(args);
	}

}
