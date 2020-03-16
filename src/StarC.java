
public class StarC {
	public static void main(String[] args) {

		int height = 5;
		int middle_index = height/2+1;
		int space = 0;
		for (int i = 1; i <= height; i++) {
			
			for (int j = height; j >= 1; j--) {
				if (i == height) {
					System.out.print("*");
				} else if (j == i) {
					if(i >= middle_index) {
						System.out.print("*");
						if(i>middle_index) {
							
							for(int k=0;k<=space;k++) {
								System.out.print(" ");
							}
							System.out.print("*");
							space += 2;
						}
					}
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}
