package com.epam.fundamentals;


class FizzBuzzHelper {
	static void runApplication() {
		FizzBuzz fizBuzz = new FizzBuzz();
		for(int i = 1; i <= 100; i++) {
		     fizBuzz.printFizzBuzz(i);  	
		}	
	}
}
public class FizzBuzz {
    
	public boolean isDividedByThree(int num) {
		
		if(num % 3 == 0) {
			return true;
		}
		return false;
	}
	public boolean isDividedByFive(int num) {
		
		if(num % 5 == 0 ) {
			return true;
		}
		return false;
	}
	public  void printFizzBuzz(int num) {
		
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
		FizzBuzzHelper.runApplication();
	}
}
