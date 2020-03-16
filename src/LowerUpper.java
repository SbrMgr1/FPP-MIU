import java.util.Scanner;


//Programming Assignment 2-12 question 3
public class LowerUpper {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any string");
		
		String inputValue = input.next();
		
		System.out.println("String in lower case is:"+inputValue.toLowerCase());
		System.out.println("String in upper case is:"+inputValue.toUpperCase());
		
	}
}
