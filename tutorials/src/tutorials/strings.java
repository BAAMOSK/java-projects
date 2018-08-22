package tutorials;

public class strings {
	public static void main(String[] args) {
		String myString = "This is my string";
		myString = myString + ", more more more";
		
		String copyright = "Tee Mak " + "\u00AE";
		
		//System.out.println("My string is this => " + myString);
		
		System.out.println(copyright);
		
		//Will cast an int to a string if first var is string
		int myAge = 38;
		String myStringAge = "I am " + myAge + " years old.";
		System.out.println(myStringAge);
	}
}
