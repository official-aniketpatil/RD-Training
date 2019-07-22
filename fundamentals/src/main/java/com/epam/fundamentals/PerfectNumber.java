package com.epam.fundamentals;

import java.util.Scanner;

public class PerfectNumber {

	static int getFactorSum(int num) {
		int sum=0;
		for(int i=1; i <= num/2; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	static boolean isPerfectNumber(int num) {
		
		if(getFactorSum(num) == num) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
        if(isPerfectNumber(num)) {
        	System.out.println(num +" is a Perfect Number");
        } else {
        	System.out.println(num + " is not a Perfect Number");
        }
	}

}
