package com.epam.functional_inteface;

import java.util.function.Predicate;

public class PredicateExample {
	
	private Integer[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	
	public void printNumbers(Predicate<Integer> predicate) {
		
		for(int element : elements) {
			if(predicate.test(element)) {
				System.out.println(element);
			}
		}
	}
	
	private void helper() {
	
		Predicate<Integer> greaterThanFive = a -> a > 5;
		Predicate<Integer> lessThanFive = a -> a < 5;
		Predicate<Integer> divisibleByFour = a -> a % 4 == 0 ;
		
		System.out.println("Numbers less than five are");
		printNumbers(lessThanFive);
		System.out.println("Numbers greater than five are");
		printNumbers(greaterThanFive);
		System.out.println("Numbers greater than five and divisible by 4");
		printNumbers(greaterThanFive.and(divisibleByFour));
		
	}
	
	public static void main(String[] args) {
		PredicateExample predicateExample = new PredicateExample();
		predicateExample.helper();
	}

}
