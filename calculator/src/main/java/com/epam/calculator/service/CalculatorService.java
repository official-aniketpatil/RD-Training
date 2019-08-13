package com.epam.calculator.service;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class CalculatorService {
	private Logger logger = LogManager.getLogger(CalculatorService.class);
	private String queryString;
	private String operator;
	private double a;
	private double b;

	public CalculatorService(String queryString) {
		this.queryString = queryString;
	}

	public double addition() {
		return a + b;
	}

	public double subtraction() {
		return a - b;
	}

	public double multiplication() {
		return a * b;
	}

	public double division() {
		return a / b;
	}

	public double computeResult() {
		extractParamsFromQueryString();
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

	private void extractParamsFromQueryString() {
		String[] pairs = queryString.split("&");

		for (String pair : pairs) {
			if (pair.contains("operator")) {
				operator = pair.split("=")[1];
			}
			if (pair.contains("fNum")) {
				a = Double.parseDouble(pair.split("=")[1]);
			}
			if (pair.contains("sNum")) {
				b = Double.parseDouble(pair.split("=")[1]);
			}
		}
	}

}
