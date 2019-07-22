package com.epam.fundamentals;


public class FizzBuzz {
    
	static boolean isDividedByThree(int num) {
		
		if(num % 3 == 0) {
			return true;
		}
		return false;
	}
	static boolean isDividedByFive(int num) {
		
		if(num % 5 == 0 ) {
			return true;
		}
		return false;
	}
	static void printFizzBuzz(int num) {
		
		if(isDividedByThree(num) && isDividedByFive(num)) {
			System.out.print("FizzBuzz ");
		} else if(isDividedByThree(num)) {
			System.out.print("Fizz ");
		} else if(isDividedByFive(num)) {
			System.out.print("Buzz ");
		} else {
			System.out.print(num+" ");
		}
	}
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
		     printFizzBuzz(i);  	
		}	
	}
}
