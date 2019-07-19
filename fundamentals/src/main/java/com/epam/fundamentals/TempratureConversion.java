package com.epam.fundamentals;


public class TempratureConversion {

	static float celsiusToFahrenheit(float celsius) {
		return (9 * celsius) / 5 + 32;
	}
	
	static float fahrenheitToCelsius(float fahrenheit) {
		return (fahrenheit - 32) * (5 / 9);		
	}
	
	public static void main(String[] args) {
		int choice=Integer.parseInt(args[0]);
		float value=Float.parseFloat(args[1]);
		
		switch(choice) {
		case 0:
			System.out.println( celsiusToFahrenheit(value) );
			break;
		case 1:
			System.out.println( fahrenheitToCelsius(value) );
			break;
		default:
			System.out.println("Enter a valid choice");
		}
	}

}
