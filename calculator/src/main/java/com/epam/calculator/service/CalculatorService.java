package com.epam.calculator.service;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class CalculatorService {
	private Logger logger = LogManager.getLogger(CalculatorService.class);
	private String operator;
	private double firstNumber;
	private double secondNumber;

	public CalculatorService(double firstNumber, double secondNumber, String operator) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.operator = operator;
	}

	public double addition() {
		return firstNumber + secondNumber;
	}

	public double subtraction() {
		return firstNumber - secondNumber;
	}

	public double multiplication() {
		return firstNumber * secondNumber;
	}

	public double division() {
		return firstNumber / secondNumber;
	}

	public double computeResult() {
		switch (operator) {
		case "+":
			return addition();
		case "-":
			return subtraction();
		case "*":
			return multiplication();
		case "/":
			return division();
		default:
			logger.trace("Enter valid choice");
			return 0.0;
		}
	}
}
