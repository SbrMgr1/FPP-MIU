package com.fpp.Lession11HashTable;

public class Main {
	public static void main(String[] args) {
		MyHashtable hashtable = new MyHashtable();
		
		hashtable.put("John Smith","641-472-1111");
		hashtable.put("Julie Woods","641-472-2222");
		hashtable.put("Joseph Lerman","641-472-555");
		hashtable.put("Poul Lerman","641-472-555");
		hashtable.put("John Revolinski","641-472-544");
		hashtable.put("Samsher Bahadur Rana","641-472-233");
		hashtable.put("Rohit Manandar","641-472-340");
		hashtable.put("Nabin Paudel","641-472-333");
		hashtable.put("Biswas Mishra","641-472-670");
		hashtable.put("Pradip Acharya","641-472-550");
		
		//allows duplicate key with different value
		hashtable.put("Pradip Acharya","641-472-552");// when try to get value by key then hashtable always returns previous value (641-472-550)
		
		System.out.println("All Datas :\n"+hashtable.toString());
		System.out.println("------------------");
		System.out.println("Total number of entry:"+hashtable.countEntry());
		System.out.println("------------------");
		System.out.println("Total number elements in largest LinkedList:\n"+hashtable.getElementsInLongestLinkedList());
		System.out.println("------------------");
		System.out.println("Total number empty cells in the table:"+hashtable.getNumberOfEmptyCell());
		
		
	}
}
