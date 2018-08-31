public class Loops {
	public static void main(String[] args) {
		//System.out.println("Interest rate for $10,000 at 2% is $" + String.format("%.02f", calcInterest(10000,2.0)));
		//System.out.println("Interest rate for $10,000 at 3% is $" + String.format("%.02f", calcInterest(10000,3.0)));
		/*double interestRate = 2.3429;
		String precisionFloat = String.format("%.02f", interestRate);
		System.out.println(precisionFloat);*/
		//for(int i = 2; i < 9; i++) {
		for(int i = 8; i > 1; i--) {
			System.out.println("Interest rate for $10,000 at " + i + "% is $" 
				+ String.format("%.2f", calcInterest(10000,i)) + ".");
		}
	}


	public static double calcInterest(double base, double rate) {
		return base * (rate/100);
	}
}
