package com.teemak;

public class calcFeetAndInchesToCentimeters {
	
	public static void main(String[] args) {
		//System.out.println(convertUnitToCents(6,0));
		//System.out.println(convertUnitToCents(1,12));
		System.out.println(convertUnitToCents(73));
	}
	
	public static double convertUnitToCents(double feet, double inches) {		
		if (feet < 0 || inches < 0 || inches > 12) {
			return -1;
		}
		double feetToInches = feet * 12;
		double inchesToCents = (feetToInches + inches) * 2.54;
		System.out.println("Feet: " + feet + "/ Inches: " + inches + "/ Result: " + inchesToCents);
		double cents = inchesToCents;
		return cents;
	}
	
	public static double convertUnitToCents(int inches) {
		//Used for inches > 12
		if(inches < 0) {
			return -1;
		}
		double feet = inches /  12;
		double remainingInches = inches % 12;
		return convertUnitToCents(feet, remainingInches);
	}
}
