import javax.swing.*;
import java.util.*;

public class Prog5 {
	public static void main(String[] args) {
		System.out.println("Input any string");
		Scanner input = new Scanner(System.in);
		 
		String inputVal = input.next();
		
		String outputVal = "";
		
		for(int i=0; i<inputVal.length();i++) {
			outputVal = outputVal + inputVal.charAt(inputVal.length()-1-i);
		}
	
		System.out.println("input was :"+inputVal+" and output is:"+outputVal);
	}
}
