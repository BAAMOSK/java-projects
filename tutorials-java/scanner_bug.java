import java.util.Scanner;

//%s => string, %d => digit

class ScannerBug {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("What is your age? ");
		int age = in.nextInt();
		in.nextLine(); // read the newline
		System.out.print("What is your name? ");
		String name = in.nextLine();
		System.out.printf("Hello %s, age %d\n", name, age);
	}
}
