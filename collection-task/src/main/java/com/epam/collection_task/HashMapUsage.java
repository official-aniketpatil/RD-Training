package com.epam.collection_task;

import java.util.HashMap;
import java.util.Map;

class HashMapUsageHelper {
	public static void runApplication() {
		Input input = new Input();
		System.out.println("Enter a string to get char count");
		String string = input.getString();
		CharCount charCount = new CharCount(string);
		charCount.printCharCount();
	}
}
class CharCount {
	private String string;
	private HashMap<Character,Integer> charWithCount; 
	
	public CharCount(String string){
		this.string = string;
		this.charWithCount = new HashMap<Character, Integer>();
	}
	private void calculateCharacterCount() {
		int length = string.length();
		for(int i = 0; i < length; i++) {
			char key = string.charAt(i);
			if(charWithCount.containsKey(key)) {
				int charCount = charWithCount.get(key);
				charWithCount.put(key, charCount+1);
			}else {
				charWithCount.put(key,1);
			}
		}
	}
	public void printCharCount(){
		
		calculateCharacterCount();
		
		for(Map.Entry<Character, Integer> entry : charWithCount.entrySet()) {
			System.out.println(entry);
		}
	}
}
public class HashMapUsage {

	public static void main(String[] args) {
		HashMapUsageHelper.runApplication();

	}

}
