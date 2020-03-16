package CallByValueAndReferenceTest;

public class Main {
	public static void main(String[] args) {
		Staff staff = new Staff();
		staff.setName("A");
		
		Staff staff2 = new Staff();
		staff2.setName("B");
		//staff = swap(staff,staff2);
		
		
		//System.out.println("staff2:"+staff2.getName());
		
		
		int a = 1;
		int b = 2;
		
		swap(a, b);

		System.out.println("A: " + a + "B: "+ b);
	}

	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		
		//return x
	}

}
