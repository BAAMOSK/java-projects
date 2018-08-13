package tutorials;



public class operators {
	public static void main(String[] args) {
		
		int result = 1 + 2;
		
		//System.out.println("The answer is " + result + ".");
		
		int prevResult = result - 3;
		
		result = prevResult++;
		result++;
		
		if (prevResult == result && result > 0 || prevResult == 1) {
			System.out.println("Okay!");			
		}
		
		System.out.println(prevResult);
		System.out.println(result);
		
		//Ternary
		boolean carColor = false;
		boolean myCar = carColor ? true : false;
		
		if(myCar) {
			System.out.println("My car is True!");			
		}

		final class Cats {
			
		}
						
		/*if (myCar instanceof Cats) {
			System.out.println("Checks if subclass.");
		}*/
		
		double firstValue = 20;
		double secondValue = 80;
		double total = (firstValue + secondValue) * 25;
		
		System.out.println(total);
	}
}
