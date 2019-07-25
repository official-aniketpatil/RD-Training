package com.epam.io;

import com.epam.io.exception.ArgumentMismatchException;

public class Validator {

	public static void validateArguments(String[] args) {
    	if(args.length != 2) {
    		throw new ArgumentMismatchException("There must be exact two argument");
    	}
    }
}
