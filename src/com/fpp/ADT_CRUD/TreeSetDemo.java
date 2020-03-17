package com.fpp.ADT_CRUD;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String args[]) {
		// Create a tree set
		TreeSet<String> ts = new TreeSet<String>();
		// Add elements to the tree set
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");

		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
