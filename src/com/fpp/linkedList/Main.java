package com.fpp.linkedList;

public class Main {
	public static void main(String[] args){
		
		MyStringLinkedList myStringLinkedList = new MyStringLinkedList();
		myStringLinkedList.add("a");
		myStringLinkedList.add("b");
		myStringLinkedList.add("c");
		myStringLinkedList.addLast("j");
		myStringLinkedList.addLast("k");
		
		myStringLinkedList.deleteLast();
		
		System.out.println(myStringLinkedList);
		
		
		///Queue implementation using Custom Linked list
//		QueueUsingLinkedList queueUsingLinkedList = new QueueUsingLinkedList();
//		queueUsingLinkedList.enque("A");
//		queueUsingLinkedList.enque("B");
//		queueUsingLinkedList.enque("C");
//		queueUsingLinkedList.enque("D");
//		
//		System.out.println(queueUsingLinkedList);
		
	}
}
