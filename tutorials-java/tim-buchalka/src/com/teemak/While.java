package com.teemak;

public class While {
	public static void main(String[] args) {
		/*int count = 1;
		do {
			System.out.println("While loop... " + count);
			count++;
		} while (count < 1);*/
		getEvenNumbers(10);
	}
	
	public static void getEvenNumbers(int number) {
		int count = 1;
		while(count <= number) {
			if(count % 2 == 0) {
				System.out.println(count);
			}
			count++;
		}
	}
}
