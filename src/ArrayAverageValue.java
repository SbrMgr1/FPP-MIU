import java.util.Arrays;
//Programming Assignment 2-12 Question 2
public class ArrayAverageValue {
	public static void main(String[] args) {
		int[] arrayOfInts = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		System.out.println("Average Value is:"+get_average(arrayOfInts));
	}
	static int get_average(int[] arrayOfInts) {
		int sum = 0;
		int avg = 0;
		for(int i=0;i<arrayOfInts.length;i++) {
			sum += arrayOfInts[i];
		}
		try {
			return sum/arrayOfInts.length;
		}catch (Exception e) {
			throw e;
		}
		
	}
}
