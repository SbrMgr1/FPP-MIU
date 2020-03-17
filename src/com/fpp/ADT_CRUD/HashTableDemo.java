package com.fpp.ADT_CRUD;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<String,String> hm = new Hashtable<String,String>();
		
		hm.put("ab","5");
		hm.put("abc","7");
		hm.put("abcd","8");
//		hm.remove("abcd");
		System.out.println(hm.containsKey("abii"));
		// to go for printing invidually
		Set set = hm.entrySet();
		Iterator it = set.iterator();

		while(it.hasNext()){
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
		System.out.println(hm.get("abcd"));
	}
}
