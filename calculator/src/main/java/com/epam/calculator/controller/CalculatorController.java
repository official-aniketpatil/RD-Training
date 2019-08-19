package com.epam.calculator.controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.epam.calculator.service.CalculatorService;

@WebServlet(urlPatterns = "/calculate")
public class CalculatorController extends HttpServlet {
	private static final long serialVersionUID = 4519370733916451742L;
	private static Logger logger = LogManager.getLogger(CalculatorController.class);

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		try {
			firstNumber = Double.parseDouble(request.getParameter("fNum"));
			secondNumber = Double.parseDouble(request.getParameter("sNum"));
		} catch (NumberFormatException ex) {
			logger.error(ex.getMessage());
		}
		String operator = request.getParameter("operator");
		logger.trace(operator);
		CalculatorService calculatorService = new CalculatorService(firstNumber, secondNumber, operator);
		double result = calculatorService.computeResult();

		try {
			response.getWriter().append("result is: " + result);
			logger.trace("result is:" + result);
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
	}
}
