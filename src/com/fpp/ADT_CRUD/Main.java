package com.fpp.ADT_CRUD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {

		ArrayList<Character> arrayList = new ArrayList<Character>();
		LinkedList<Character> linkedList = new LinkedList<Character>();
		Stack<Character> stack = new Stack<Character>();
		Queue<Character> queue = new LinkedList<Character>();
		TreeMap<Character, Character> treeMap = new TreeMap<Character, Character>();
		HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
		Hashtable<Character, Character> hashtable = new Hashtable<Character, Character>();
//		Set<Character> set = new Set<Character>();

		
		// CREATE
		arrayList.add('A');
		linkedList.add('A');
		stack.push('A');///////////////////////////////// Stack ///////////////////////////////
		queue.add('A');
		treeMap.put('a', 'A');
		hashMap.put('a', 'A');
		hashMap.put('a', 'A');

		// READ
		arrayList.get(0);
		linkedList.get(0);
		stack.pop();////////////////////////////////// Stack ///////////////////////////
		queue.poll();////////////////////////////////// Queue ///////////////////////////
		treeMap.get('a');
		hashMap.get('a');
		hashMap.get('a');
		
		arrayList.size();
		linkedList.size();
		stack.size();
		queue.size();
		treeMap.size();
		hashMap.size();
		hashMap.size();
		
		arrayList.isEmpty();
		linkedList.isEmpty();
		stack.isEmpty();
		queue.isEmpty();
		treeMap.isEmpty();
		hashMap.isEmpty();
		hashMap.isEmpty();
		
		// UPDATE
		arrayList.set(0,'b');
		linkedList.set(0,'b');
//		stack.set(0,'b');
		//queue.set(0,'b');////////////////////////////////// Queue ///////////////////////////
		treeMap.put('a','B');
		hashMap.put('a','B');
		hashMap.put('a','B');
		
		// DELETE
		arrayList.remove(0);
		linkedList.remove(0);
//		stack.remove(0);
//		boolean remove = queue.remove(0);
		treeMap.remove('a');
		hashMap.remove('a');
		hashMap.remove('a');
		
		arrayList.clear();
		linkedList.clear();
		stack.clear();
		queue.clear();
		treeMap.clear();
		hashMap.clear();
		hashMap.clear();
		
		

	}
}
