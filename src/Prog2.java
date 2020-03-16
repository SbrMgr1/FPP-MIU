
public class Prog2 {
	
	public static void main(String[] args) {
		float firstNum = (float) 1.27;
		float secondNum = (float) 3.881;
		float thirdNum = (float) 9.6;
		
		float first_result = firstNum + secondNum + thirdNum;
		
		System.out.println("The sum of the floats as an integer, obtained by casting the sum to type int :"+((int)first_result));
		System.out.println("the sum of the floats as an integer, obtained by rounding the sum to the nearest :"+Math.round(first_result));
		
	}

}
