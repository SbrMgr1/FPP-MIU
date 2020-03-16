import java.util.*;

public class Prog6 {
	public static void main(String[] args) {

		
		System.out.println("Input is :");
	
		String[] output = new String[args.length];
		Boolean found;
		int counter = 0;
		
		for(int i = 0; i<args.length;i++) {
			System.out.print(args[i]+" ");
			found = false;
			for(int j = 0; j<output.length;j++) {
				
				if(args[i].equals(output[j])) {
					
					found = true;
					break;
				}
				
			}
			if(found == false) {
				output[counter] = args[i];
				counter++;
			}
		}
		System.out.println("");
		System.out.println("Output is:");
		for(int k = 0; k<output.length;k++) {
			if(output[k] != null) {
				System.out.print(output[k]+" ");
			}
			
		}
		
	}
}
