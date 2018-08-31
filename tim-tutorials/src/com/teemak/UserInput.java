package com.teemak;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your birth year: ");
		boolean isInt = scan.hasNextInt();
		
		if(isInt) {			
			int birthYear = scan.nextInt();
			int age = 2018 - birthYear;
			
			if (age > 0 && age < 101) {
				scan.nextLine();
			
				System.out.println("Enter your name: ");
				String name = scan.nextLine();			
				System.out.println("Your name is " + name + ". Your age is " + age + ".");
			} else {
				System.out.println("Your year of birth should be a positive four digit number not greater than 2018 and less than 1918...");
			}
		} else {
			System.out.println("You must enter a integer for your birth year.");
		}
		scan.close();		
	}
}
