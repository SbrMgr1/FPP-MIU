import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PossibleStrings {
	public static void main(String[] strings) {
		System.out.println("Enter any string");
		Scanner input = new Scanner(System.in);
		String givenStr = input.next();
		
		String[] new_data = {""};
		System.out.println(Arrays.toString(new_data));
		
		for (int length = 1; length <= givenStr.length(); length++) {
			ArrayList<String> tmp = new ArrayList<String>();
			for (int index = 0; index < givenStr.length(); index ++) {
				if((index+length) <= givenStr.length()) {
					tmp.add(givenStr.substring(index,(index+length)));
				}
				
			}
			System.out.println(Arrays.toString(tmp.toArray()));
			
		}
	}
	
}
