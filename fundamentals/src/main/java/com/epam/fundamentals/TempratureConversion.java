package com.epam.fundamentals;

import com.epam.exceptions.ArgumentMismatchException;

class TempratureConversionHelper {

	private TempratureConversionHelper() {

	}

	public static void runApplication(String[] args) throws ArgumentMismatchException {

		if (args.length != 2) {
			throw new ArgumentMismatchException("There must be exact Two arguments");
		}

		int choice = Integer.parseInt(args[0]);
		float value = Float.parseFloat(args[1]);

		switch (choice) {
		case 0:
			System.out.println(TempratureConversion.celsiusToFahrenheit(value));
			break;
		case 1:
			System.out.println(TempratureConversion.fahrenheitToCelsius(value));
			break;
		default:
			System.out.println("Enter a valid choice");
		}
	}
}

public class TempratureConversion {

	public static float celsiusToFahrenheit(float celsius) {
		return (9 * celsius) / 5 + 32;
	}

	public static float fahrenheitToCelsius(float fahrenheit) {
		return (fahrenheit - 32) * (5 / 9);
	}

	public static void main(String[] args) throws ArgumentMismatchException {

		try {

			TempratureConversionHelper.runApplication(args);

		} catch (ArgumentMismatchException argumentMismatchException) {

			System.out.println(argumentMismatchException.getMessage());

		}
	}

}
