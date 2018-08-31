package com.teemak;

public class Score {
	
	public static void main(String[] args) {	
		//calculateScore(true, 800, 5, 100);
		//calculateScore(true, 10000, 8, 200);	
		
		int teemak = calculateHighScorePosition(1500);		
		displayHighScorePosition("Tee Mak", teemak);
		
		int crystal = calculateHighScorePosition(900);
		displayHighScorePosition("Crystal", crystal);
		
		int oscar = calculateHighScorePosition(400);
		displayHighScorePosition("Oscar", oscar);
		
		int erza = calculateHighScorePosition(50);
		displayHighScorePosition("Erza", erza);
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
	//VOID functions are called procedures
	public static void displayHighScorePosition(String name, int position) {		
		String result = name + " managed to get into position " + position + " on the high score table!";
		System.out.println(result);
	}
	
	public static int calculateHighScorePosition(int score) {
		int position;
		if(score > 1000) {
			position = 1;
		} else if(score > 500 && score <= 1000) {
			position = 2;
		} else if(score > 100 && score <= 500) {
			position = 3;
		} else {
			position = 4;
		}
		return position;
	}		
	
}