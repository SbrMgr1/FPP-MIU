import java.util.Arrays;

public class ArrayOfInts {
	public static void main(String[] args) {
		int[] arrayOfInts = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		System.out.println("Min value is:"+min(arrayOfInts));
		System.out.println("sorted array is:"+Arrays.toString(sort(arrayOfInts)));
		System.out.println("Average Value is:"+get_average(arrayOfInts));
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
	static int[] sort(int[] arrayOfInts) {
		int tmp;
		for(int i=0;i<arrayOfInts.length;i++) {
			for(int j=i+1;j<arrayOfInts.length;j++) {
				if(arrayOfInts[i]>arrayOfInts[j]) {
					tmp = arrayOfInts[i];
					arrayOfInts[i] = arrayOfInts[j];
					arrayOfInts[j] = tmp;
				}
			}
		}
		return arrayOfInts;
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
