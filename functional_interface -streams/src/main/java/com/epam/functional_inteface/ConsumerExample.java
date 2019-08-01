package com.epam.functional_inteface;

import java.util.function.Consumer;

public class ConsumerExample {
	private Integer[] elements = {1,2,3,4,5};
	
	public void printArray(Consumer<Integer[]> print) {
		print.accept(elements);
	}
	
	public void printElementWithSquare(Consumer<Integer[]> print) {
		print.accept(elements);
	}
	
	private void helper() {
		Consumer<Integer[]> print = items -> {
			for(int item : items) {
				System.out.println(item);
			}
		};
		printArray(print);
		
		print =  print.andThen(items -> {
			for(int item :	items) {
				System.out.println(item * item);
			}
		});
		
		System.out.println("elements followed by square");
		printElementWithSquare(print);
		
	}
	
	public static void main(String[] args) {
		ConsumerExample consumerExample = new ConsumerExample();
		consumerExample.helper();

	}

}
