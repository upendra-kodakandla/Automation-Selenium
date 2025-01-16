package intoduction;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		
		// String is an object and collection of characters
		/*
		 * String can be defined in two ways 
		 * 1. String literal 
		 * 2. String new keyword
		 */
		
		//string literal
		String s = "Welcome to here";
		String s1 = "Welcome to here";
		
		String s2 = new String("Hello");
		String s3 = new String("Hello");
		
		String[] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
		//Reverse of the string
		
		for(int i = s.length()-1; i>=0; i--) {
		System.out.print(s.charAt(i));
		}

	}

}
