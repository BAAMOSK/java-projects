package com.teemak;

public class ParseString {
	public static void main(String[] args) {
		String numAsString = "2018";
		System.out.println("This is a string " + numAsString + ".");
		int number = Integer.parseInt(numAsString);
		int result = number + 22;
		System.out.println(result);
	}
}
