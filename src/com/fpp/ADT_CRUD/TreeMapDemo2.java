package com.fpp.ADT_CRUD;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TreeMapDemo2{
	public static void main(String[] args){
			TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
			tm.put("Zara",5);
			tm.put("Sara",6);
			tm.put("Samsher",6);

			System.out.println("datas are:"+tm);

			// we can access these elements with following ways
			Set set = tm.entrySet();
			Iterator it = set.iterator();
			while(it.hasNext()){
				Map.Entry me = (Map.Entry)it.next();
				System.out.println(me.getKey()+":"+me.getValue());
			}
			
			if(tm.containsKey("Samsher")) {
				System.out.println("found.");
			}else {
				System.out.println("not found.");
				
			}
			
			System.out.println(tm.get("Samsher"));
			
			
			if(tm.containsValue(8)) {
				System.out.println("found.");
			}else {
				System.out.println("not found.");
				
			}
	}
}
