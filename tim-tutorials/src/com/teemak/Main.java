package com.teemak;

public class Main {
	
	public static void main(String[] args) {	
		calculateScore(true, 800, 5, 100);
		calculateScore(true, 10000, 8, 200);	
	}	
	//VOID means don't return anything
	//REPLACE void with data type to return i.e. String, Int, Boolean
	//public static String calculateScore(args) {return <String result>;}
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if(gameOver) {
			int finalScore = score + levelCompleted * bonus;
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore + "!");
		}
	}
	
}