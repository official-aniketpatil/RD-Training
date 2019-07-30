package com.epam.functional_inteface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

	List<Integer> number1 = new ArrayList<Integer>();
	List<Integer> number2 = new ArrayList<Integer>();
	List<Integer> mergedList = new ArrayList<Integer>();
	
	public void printMergedList(BiConsumer<List<Integer>, List<Integer>> biConsumer) {
		biConsumer.accept(number1, number2);
		System.out.println(mergedList);
	}
	public void helperMethod() {
		Collections.addAll(number1, 1,2,3,4);
		Collections.addAll(number2, 5,6,7,8);
		
		BiConsumer<List<Integer>, List<Integer>> biConsumer = (list1,list2) -> {
			mergedList.addAll(list1);
			mergedList.addAll(list2);
		};
		printMergedList(biConsumer);
	}
	public static void main(String[] args) {
		BiConsumerExample biConsumerExample = new BiConsumerExample();
		biConsumerExample.helperMethod();
	}
}
