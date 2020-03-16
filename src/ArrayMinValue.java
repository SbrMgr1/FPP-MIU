import java.util.Arrays;

// Programming Assignment 2-12 Question 1
public class ArrayMinValue {
	public static void main(String[] args) {
		int[] arrayOfInts = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		System.out.println("Min value is:"+min(arrayOfInts));
	}
	static int min(int[] arrayOfInts) {
		int min_value = 0;
		for(int i=0;i<arrayOfInts.length;i++) {
			if(i==0) {
				min_value = arrayOfInts[i];
			}else if(min_value > arrayOfInts[i]) {
				min_value = arrayOfInts[i];
			}
		}
		return min_value;
	}
}
