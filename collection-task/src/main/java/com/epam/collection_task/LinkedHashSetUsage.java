package com.epam.collection_task;

import java.util.LinkedHashSet;

class LinkedHashSetUsageHelper {
	public static void runApplication() {
		Input input = new Input();
		System.out.println("Enter a string to remove duplicate and print in order");
		String string = input.getString();
		LinkedHashSetUsage linkedHashSetUsage = new LinkedHashSetUsage(string);
		linkedHashSetUsage.printStringWithoutDuplication();
	}
}
public class LinkedHashSetUsage {
    private String string;
	private LinkedHashSet<Character> linkedHashSet;
	
    public LinkedHashSetUsage(String string) {
    	this.string = string ;
    	linkedHashSet = new LinkedHashSet<Character>();
    }
    
    public void printStringWithoutDuplication(){
		String result = removeDuplicateCharacter();
		System.out.println(result);
	}
    private String removeDuplicateCharacter() {
    	String result = "";
    	for(int i = 0; i < string.length(); i++) {
    		linkedHashSet.add(string.charAt(i));
    	}
    	for(char ele : linkedHashSet) {
    		result = result + ele;
    	}
    	return result;
    }
	public static void main(String[] args) {
		LinkedHashSetUsageHelper.runApplication();

	}

}
