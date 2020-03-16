import java.io.*;
import java.net.*;
import java.util.Arrays;

import javax.swing.*;

class J_Test{
	public static void main(String[] string) {
		
		int[] src = {2,5,6};
		int srcPos = 1;
		int[] dest = {1,2,3,4,1,8,9,8,3};
		int destPos = 7;
		int length = 2;

		System.arraycopy(src, srcPos, dest, destPos, length);
		
		System.out.println(Arrays.toString(dest));
		
	}
	
	
}