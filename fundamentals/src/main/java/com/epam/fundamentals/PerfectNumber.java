package com.epam.fundamentals;

import java.util.Scanner;

class Input {
	private Scanner sc;
	
	public Input(){
		sc=new Scanner(System.in);
	}
	
	public String getString() {
		return sc.next().trim();
	}
	
	public int getInteger() {
		return sc.nextInt();
	}
}
class PerfectNumberHelper {
	
	private PerfectNumberHelper() {
		
	}
	
	public static void runApplication() {
		
		System.out.println("Enter a number");
		int num = new Input().getInteger();
		PerfectNumber perfectNumber = new PerfectNumber(num);
		
        if(perfectNumber.isPerfectNumber(num)) {
        	System.out.println(num +" is a Perfect Number");
        } else {
        	System.out.println(num + " is not a Perfect Number");
        }
	}
}
public class PerfectNumber {
	 private int num;
	 
	 public PerfectNumber(int num){
		 this.num = num;
	 }
	 private int getFactorSum(int num) {
		int sum=0;
		
		for(int i=1; i <= num/2; i++) {
			
			if(num % i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}
	public boolean isPerfectNumber(int num) {
		
		return (getFactorSum(num) == num) ? true : false ;
	
	}
	
	public static void main(String[] args) {
		PerfectNumberHelper.runApplication();
	}

}
