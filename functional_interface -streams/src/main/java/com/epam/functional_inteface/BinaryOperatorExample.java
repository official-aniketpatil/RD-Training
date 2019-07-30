package com.epam.functional_inteface;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public void performOperation(BinaryOperator<Integer> binaryOperator) {
		System.out.println(binaryOperator.apply(2, 3));
	}
	
	public void helper() {
		BinaryOperator<Integer> add = (a, b) -> a + b;
		BinaryOperator<Integer> multiply = (a, b) -> a * b;
		System.out.println("addition of two nos. is");
		performOperation(add);
		System.out.println("Multiplication of two nos. is");
		performOperation(multiply);
		
		System.out.println("maximum of two argument is");
		BinaryOperator<Integer> maxArgument = BinaryOperator.maxBy((a,b) -> a - b);
		System.out.println(maxArgument.apply(4, 5));
		System.out.println("minimum of two argument is");
		BinaryOperator<Integer> minArgument = BinaryOperator.minBy((a,b) -> a - b);
		System.out.println(minArgument.apply(4, 5));
	}
	public static void main(String[] args) {
		
		BinaryOperatorExample binaryOperatorExample = new BinaryOperatorExample();
		binaryOperatorExample.helper();
	}

}
