package com.teemak;

public class ForStatement {

	public static void main(String[] args) {
			System.out.println(calcInterest(10000, 2.0));

	}
	
	public static double calcInterest(double amount, double interestRate) {
		return amount * (interestRate/100);
	}

}
