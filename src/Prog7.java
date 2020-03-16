import java.util.*;
public class Prog7 {
	public static void main(String[] args) {
		System.out.println(collectData());
	}
	private static String collectData() {
		System.out.println("Enter the table name");
		Scanner input = new Scanner(System.in);	
		String tableName = input.next();
		System.out.println("Now enter number of column");
		System.out.println();
		Integer no = input.nextInt();	
		
		String[] columnNames = new String[no];
		for(int i=0;i<no;i++) {
			System.out.println("Enter the column name");
			System.out.println();
			columnNames[i] = input.next();
		}
		
		return "SELECT "+String.join(",", columnNames)+"\n" + 
				"FROM "+tableName+"\n" + 
				"WHERE salary > 55000.0 ";
	}
}
