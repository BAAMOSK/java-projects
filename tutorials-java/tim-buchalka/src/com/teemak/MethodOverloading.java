package com.teemak;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int newScore = calculateScore("Tee", 500);
		System.out.println("New score is " + newScore + "!");
		calculateScore(888);
		calculateScore();
	}
	
	public static int calcFeetAndInchesToCentimeters() {
		return 0;
	}
	
	public static int calculateScore(String name, int score) {
		System.out.println(name + " scored " + score + " points!");
		return score * 1000;		
	}
	
	public static int calculateScore(int score) {
		System.out.println("Anon has scored " + score + "!!!");
		return score * 1000;
	}

	public static int calculateScore() {
		System.out.println("No player, no score...");
		return 0;		
	}
}
