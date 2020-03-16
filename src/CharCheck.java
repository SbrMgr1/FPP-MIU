import java.util.Scanner;

public class CharCheck {
	public static void main(String[] args) {
		
		System.out.println("Enter any number");
		Scanner input = new Scanner(System.in);
		int char1 = input.nextInt();
		
		if  ((char1 >= 'a')  &&  (char1 <= 'z')) {
			System.out.println("character is between a and z");
		}else {
			System.out.println("character is out of a and z");
		}
		
	}
}
