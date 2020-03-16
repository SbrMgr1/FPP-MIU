package com.fpp.ArrayListTest;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List <Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);

		List <Integer> list2 = new ArrayList<Integer>();
		
		list2.add(0);
		
		list.removeAll(list2);
		
		System.out.println("Result is:"+Arrays.toString(list.toArray()));
		
	}
}
