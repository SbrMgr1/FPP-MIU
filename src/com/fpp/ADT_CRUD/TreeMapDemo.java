package com.fpp.ADT_CRUD;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	   public static void main(String args[]) {
	      // Create a hash map
	      TreeMap<String, Double> tm = new TreeMap<String, Double>();
	      // Put elements to the map
	      tm.put("Zara", new Double(3434.34));
	      tm.put("Mahnaz", new Double(123.22));
	      tm.put("Ayan", new Double(1378.00));
	      tm.put("Daisy", new Double(99.22));
	      tm.put("Qadir", new Double(-19.08));
	      
	      System.out.println("Sorted TreeMap: " + tm);
	      
	      System.out.println("Printing all the elements in the TreeMap...");
		  // Get a set of the entries
	      Set set = tm.entrySet();
	      // Get an iterator
	      Iterator i = set.iterator();
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	      
	   }
	}
