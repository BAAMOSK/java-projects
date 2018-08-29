package com.teemak;

public class Switch {
	public static void main(String[] args) {
		int switchValue = 5;
		
		switch(switchValue) {
			case 1:
				System.out.println("Value is one.");
				break;
			case 2:
				System.out.println("Value is two.");
				break;
			case 3:
				System.out.println("Value is three.");
				break;
			case 4: case 5:
				System.out.println("Value is four or five.");
				break;
			default:
				System.out.println(switchValue);
		}
	}
}
