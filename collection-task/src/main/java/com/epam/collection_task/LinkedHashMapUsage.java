package com.epam.collection_task;

import java.util.LinkedHashMap;

class LinkedHashMapUsageHelper {
	public static void runApplication() {
		LinkedHashMapUsage linkedHashMapUsage = new LinkedHashMapUsage();
		linkedHashMapUsage.add("One", 1);
		linkedHashMapUsage.add("Two", 2);
		linkedHashMapUsage.add("Three", 3);
		linkedHashMapUsage.add("Four", 4);
		linkedHashMapUsage.printWordWithNumber();
	}
}
public class LinkedHashMapUsage {
    private LinkedHashMap<String,Integer> wordWithNumber;
    
    public LinkedHashMapUsage() {
		wordWithNumber = new LinkedHashMap<String, Integer>();
	}
    public void printWordWithNumber() {
    	System.out.println(wordWithNumber);
    }
    public void add(String word, int number) {
    	wordWithNumber.putIfAbsent(word, number);
    }
	public static void main(String[] args) {
		LinkedHashMapUsageHelper.runApplication();
	}

}
