import java.util.Scanner;

public class BufferPractice {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any string");
		String user_input = input.next();
		
		StringBuffer stringBuffer = new StringBuffer(user_input);
		stringBuffer.append(" bye");
		System.out.println(stringBuffer.toString());
		
		
	}
}
