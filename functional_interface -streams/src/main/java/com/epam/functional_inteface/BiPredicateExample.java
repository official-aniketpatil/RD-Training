package com.epam.functional_inteface;

import com.epam.streams.model.StudentList;
import java.util.List;
import java.util.function.BiPredicate;

import com.epam.streams.model.Student;

public class BiPredicateExample {
	
	public void isEquals(BiPredicate< Integer, Integer> equal) {
		
		if(equal.test(2, 2)) {
			System.out.println("both numbers are equal");
		} else {
			System.out.println("numbers are not equal");
		}
	}
	
	private void helper() {
		BiPredicate< Integer, Integer> equal = (a,b) -> a==b;
		isEquals(equal);
	}
	public static void main(String[] args) {
		BiPredicateExample biPredicateExample = new BiPredicateExample();
		biPredicateExample.helper();
	}

}
