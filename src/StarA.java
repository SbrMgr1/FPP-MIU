
//* 
//** 
//* * 
//*  * 
//*   * 
//******

public class StarA {
	public static void main(String[] args) {
		
		int height = 10;
			for(int i=1;i<=height;i++) {
				for(int j=1;j<=i;j++) {
					if(i==height){
						System.out.print("*");
					}else if(j==1) {
						System.out.print("*");
					}else if(j==i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
	}
}
