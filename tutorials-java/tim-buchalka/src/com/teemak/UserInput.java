package com.teemak;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		//Saves the value from the following line to name variable
		String name = scan.nextLine();
		System.out.println("Your name is " + name + ".");
		scan.close();
	}
}
