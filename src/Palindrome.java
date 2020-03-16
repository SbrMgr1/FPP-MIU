
public class Palindrome {
	public static void main(String[] args) {
		String word ="noon";
		if(ReverseString(word).equalsIgnoreCase(word)) {
			System.out.println("Palindrome found.");
		}else {
			System.out.println("No palindrome found.");
		}
	}
	private static String ReverseString(String inputVal) {
		
		String outputVal = "";
		
		for(int i=0; i<inputVal.length();i++) {
			outputVal = outputVal + inputVal.charAt(inputVal.length()-1-i);
		}
		return outputVal;
	}
}
