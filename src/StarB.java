
public class StarB {
	
//        *
//      * *
//    *   *
//  *     *
//*********

	public static void main(String[] args) {

		int height = 10;
		for (int i = 1; i <= height; i++) {
			for (int j = height; j >= 1; j--) {
				if (i == height) {
					System.out.print("*");
				} else if (j == 1) {
					System.out.print("*");
				} else if (j == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

}
