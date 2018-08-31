import java.util.Random;

public class GuessMyNumber {
	public static void main(String[] args) {
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		//int randomNumber = random.nextInt(101);
		System.out.println(randomNumber);	
	}
}
