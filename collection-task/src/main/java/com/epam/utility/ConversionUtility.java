package com.epam.utility;

import com.epam.model.Feet;
import com.epam.model.Inch;
import com.epam.model.Meter;

public class ConversionUtility {

	public static double toFeet(Inch inch) {
		return  0.0833 * inch.getValue();
	}
	public static double toFeet(Meter meter) {
		return 3.281 * meter.getValue();
	}
    public static double toMeter(Inch inch) {
    	return 0.0254 * inch.getValue();
	}
    public static double toMeter(Feet feet) {
		return feet.getValue() / 3.281;
	}
    public static double toInch(Feet feet) {
		return 12 * feet.getValue();
	}
    public static double toInch(Meter meter) {
		return 39.37 * meter.getValue();
	}	
}
