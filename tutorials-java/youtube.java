import java.util.Scanner;

class calculator {
	public static void main(String args[]) {
		Scanner tee = new Scanner(System.in);
		double num1, num2, result;

		System.out.println("Enter first number: ");
		num1 = tee.nextDouble();
		System.out.println("Enter second number: ");
		num2 = tee.nextDouble();

		result = num1 + num2;
		System.out.println(result);
	}
}
