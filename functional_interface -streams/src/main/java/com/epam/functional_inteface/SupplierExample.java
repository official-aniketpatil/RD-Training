package com.epam.functional_inteface;

import java.util.function.Supplier;

public class SupplierExample {

	public void print(Supplier<Integer[]> prime) {
	  Integer[] arr = prime.get();
	  for(int i : arr ) {
		  System.out.println(i);
	  }
	}
	public void helper() {
		Supplier<Double> randomNum = ()->Math.random();
		Supplier<Integer[]> prime = () -> {
			Integer[] arr = {2, 3, 5, 7 };
			return arr;
		};
		
		System.out.println("prime numbers");
		print(prime);
		
		System.out.println("random number");
		System.out.println(randomNum.get());
	}
	
	public static void main(String[] args) {
		SupplierExample supplierExample = new SupplierExample();
		supplierExample.helper();
	}

}
