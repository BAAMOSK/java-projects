import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		//String line;		
		//Scanner in = new Scanner(System.in);

		//System.out.print("Type something: ");
		//Scanner object
		//line = in.nextLine();
		//nextLine() reads input => String
		//System.out.println("You said: " + line);

		//System.out.print("Type something else: " + line);
		//line is new input
		//line = in.nextLine();
		//System.out.println("You also said: " + line);

		double cm;
		int feet, inches, remainder;
		final double CM_PER_INCH = 2.54;
		final int IN_PER_FOOT = 12;
		Scanner in = new Scanner(System.in);		

		System.out.print("Exactly how many cms? ");
		//Recieves new input => assigns to inch var
		cm = in.nextDouble();

		inches = (int) (cm / CM_PER_INCH);
		feet = inches / IN_PER_FOOT;
		remainder = inches % IN_PER_FOOT;
		System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);
	}
}
