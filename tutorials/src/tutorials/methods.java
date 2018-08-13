package tutorials;

public class methods {
	public static void main(String[] args) {		
		calculateScore(true, 8000, 6, 125);
		calculateScore(true, 10000, 8, 200);
		calculateScore(true, 1000, 1, 100);
	}
	
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {				
		if (gameOver) {
			int finalScore  = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score is " + finalScore);			
		}		
	}
}