package tutorials;

public class floatDouble {

	public static void main(String[] args) {
		//width == 32 (4 bytes)
		int myIntValue = 5;
		//width == 32 (4 bytes)
		float myFloat = 5f / 2f;
		//width == 64 (8 bytes)
		double myDouble = 5.25;
		
		int lbs = 200;
		double kilograms = 0.45359237;
		double result = kilograms * lbs;
		
		double mypi = 3.1_415_927d;
		
		/*System.out.println(myFloat);
		System.out.println(myDouble + myIntValue);*/
		
		System.out.println(result);
		System.out.println(mypi);
		
	}
}
