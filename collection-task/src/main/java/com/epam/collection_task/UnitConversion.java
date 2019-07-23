package com.epam.collection_task;

import java.util.Scanner;

import com.epam.model.Feet;
import com.epam.model.Inch;
import com.epam.model.Meter;
import com.epam.utility.ConversionUtility;

public class UnitConversion {

	public void printMenu() {
		System.out.println("Enter your choice");
		System.out.println("1) Inch to Feet");
		System.out.println("2) Inch to Meter");
		System.out.println("3) Feet to Inch");
		System.out.println("4) Feet to Meter");
		System.out.println("5) Meter to Inch");
		System.out.println("6) Meter to Feet");
		System.out.println("0) Exit");
		
	}
    public void printResult(int choice, double value) {
    	
    	switch(choice) {
    	case 1:
    	    System.out.println(value+" Inch = "+ConversionUtility.toFeet(new Inch(value))+"Feet");
    	    break;
    	case 2:
    		System.out.println(value+"Inch = "+ConversionUtility.toMeter(new Inch(value))+" Meter");
    		break;
    	case 3:
    		System.out.println(value+" Feet = "+ConversionUtility.toInch(new Feet(value))+" Inch");
    		break;
    	case 4:
    		System.out.println(value+" Feet = "+ConversionUtility.toMeter(new Feet(value))+" Meter");
    		break;
    	case 5:
    		System.out.println(value+" Meter = "+ConversionUtility.toInch(new Meter(value))+" Inch");
    		break;
    	case 6:
    		System.out.println(value+" Meter = "+ConversionUtility.toFeet(new Meter(value))+" Feet");
    		break;
    	default:
    		System.out.println("Enter a valid choice");
    	}
    }
    public  void helperMain() {
    	Scanner scanner = new Scanner(System.in);
        
		while(true) {
        	printMenu();
        	int choice=scanner.nextInt();
        	double value=scanner.nextDouble();
        	if(choice == 0) {
        		break;
        	}
        	printResult(choice,value);
        }
        
        System.out.println("Program terminated !!");
        scanner.close();
    }
	public static void main(String[] args) {
		UnitConversion unitConversion = new UnitConversion();
		unitConversion.helperMain();
	}

}
