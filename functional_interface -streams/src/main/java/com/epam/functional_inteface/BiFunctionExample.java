package com.epam.functional_inteface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {

	public void performCompositeOperation(BiFunction<Integer, Integer, Integer> add) {
		add = add.andThen(b -> 2 * b);
		System.out.println("output after composite BiFunction");
		System.out.println(add.apply(2, 3));
	}
	public void PerformOperation(BiFunction<Integer, Integer, ?> biFunction) {
		System.out.println(biFunction.apply(2, 3));
	}
	public void helper() {
		BiFunction<Integer, Integer, Integer> add = (a, b) -> { 
		  return a + b; 
		};
		BiFunction<Integer, Integer, Integer> multiply = (a, b) -> { 
			  return a * b; 
			};
		System.out.println("addition");
		PerformOperation(add);
		System.out.println("multiplication");
		PerformOperation(multiply);
		performCompositeOperation(add);
	}
	public static void main(String[] args) {
		
		BiFunctionExample biFunctionExample = new BiFunctionExample();
		biFunctionExample.helper();
	}

}
