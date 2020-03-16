package com.fpp.Lession10BinarySearchTree;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Mainclass {
	public static void main(String[] args) {
		
		
		TreeSet<String> ts = new TreeSet<String>();
		// Add elements to the tree set
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		System.out.println(ts);
//		
//		Map<String, String> map = new TreeMap<String, String>(); // create TreeMap
//
//		map.put("Key1", "Value1"); // insert a node
//		map.put("Key2", "Value2"); // insert another node
//
//		for (Entry<String, String> entry : map.entrySet()) { // iterate over entrySet
//		    String key = entry.getKey();
//		    String value = entry.getValue();
//		    System.out.println(key + ": " + value);
//		}
//		
		
//		TreeMap<String, Double> tm = new TreeMap<String, Double>();
//	      // Put elements to the map
//	      tm.put("Zara", 3434.34);
//	      tm.put("Mahnaz", 123.22);
//	      tm.put("Ayan", 1378.00);
//	      tm.put("Daisy", 99.22);
//	      tm.put("Qadir", -19.08);
//	      
//	      System.out.println("Sorted TreeMap: " + tm);
//	      
//	      System.out.println("Printing all the elements in the TreeMap...");
//		  // Get a set of the entries
//	      Set set = tm.entrySet();
//	      // Get an iterator
//	      Iterator i = set.iterator();
//	      // Display elements
//	      while(i.hasNext()) {
//	         Map.Entry me = (Map.Entry)i.next();
//	         System.out.print(me.getKey() + ": ");
//	         System.out.println(me.getValue());
//	      }
		
		
//		
//			MyBST myBST = new MyBST();
//			//a.	15, 12, 9, 56
//			myBST.insert(15);
//			myBST.insert(12);
//			myBST.insert(9);
//			myBST.insert(56);
//
//			myBST.insert(1);
//			myBST.insert(16);
//			myBST.insert(19);
//			myBST.insert(22);
//			myBST.insert(3);
//			myBST.insert(100);
//			myBST.insert(2);
//			myBST.insert(25);
//			
//			
//			myBST.printTreePRE();
//			System.out.println("--------------");
//			myBST.printTree();
//			System.out.println("--------------");
//			System.out.println(myBST.countNodes());
//			System.out.println("--------------");
//			System.out.println(myBST.countleaves());
	}
}
