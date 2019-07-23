package com.epam.collection_task;

class ArrayToStringHelper {
	ArrayToString arrayToString;
	
	public void runApplication() {
		Input input = new Input();
		int[] elements = input.getArray();
		System.out.println("press 1 if you wants to specify separator otherwise press 0");
		int separatorRequired = input.getInteger();
		if(separatorRequired == 1) {
			System.out.println("please Enter separator");
			String separator = input.getString();
			arrayToString = new ArrayToString(elements, separator);
		} else {
			arrayToString = new ArrayToString(elements);
		}
		System.out.println(arrayToString.join());
	}
}
public class ArrayToString {
	
	private int[] elements;
	private int length;
	private StringBuilder stringBuilder;
	private String separator;
	
	ArrayToString(int[] elements){
		this.elements = elements;
		this.length = elements.length;
		this.stringBuilder = new StringBuilder();
		this.separator = ",";
	}
	ArrayToString(int[] elements, String separator){
		this(elements);
		this.separator = separator;
		
	}
	public void setSeparator(String separator) {
		this.separator = separator;
	}
	public String join() {
		for(int i = 0; i < length; i++) {
			stringBuilder.append(elements[i]);
			if(i != length-1) {
				stringBuilder.append(this.separator+" ");
			}
		}
		return stringBuilder.toString();
	}
	public static void main(String[] args) {
		 
		ArrayToStringHelper arrayToStringHelper = new ArrayToStringHelper();
		arrayToStringHelper.runApplication();
	}
}
