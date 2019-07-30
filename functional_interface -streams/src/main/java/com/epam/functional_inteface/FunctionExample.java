package com.epam.functional_inteface;

import java.util.function.Function;

public class FunctionExample {

	public void printSquare(Function<Integer, Long> square) {
		System.out.println(square.apply(4));
	}
	public void helper() {
		Function<Integer, Long> square = a -> (long) (a * a);
		printSquare(square);
	}
	public static void main(String[] args) {
		FunctionExample functionExample = new FunctionExample();
		functionExample.helper();
	}

}
