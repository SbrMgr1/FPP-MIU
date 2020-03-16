package com.fpp.linkedList; 

public class MyStringLinkedList{
	
	private Node header;

	MyStringLinkedList(){
		this.header = new Node(null,null,null);
	}

	public Node add(String str){
		
		Node node = new Node(header,header.next,str);
		if(header.next != null){
			header.next.previous = node;
		}
		header.next = node;
		return node;
	}
	public int size(){
		int count = 0;
		Node next = header.next;
		while(next != null) {

			next = next.next;
			count++;
			
		}
		return count;
	}
	public String get(int pos){
		Node node = getNode(pos);
		return (node != null)?node.value:null;
		
	}

	private Node getNode(int pos){
	
		int count = 0;
		Node next = header.next;
		while(next != null) {
			
			if(count == pos){
				break;
			}
			next = next.next;			
			count++;
			
		}
		return next;
	}
	public String toString() {
		
		String printStr = "";
		Node next = header.next;
		while(next != null) {
			printStr += next.value+", ";
			next = next.next;
		}
		printStr = printStr.length()>2?printStr.substring(0,printStr.length()-2):printStr;
		return printStr;
	}
	
	public Node addLast(String str){

		Node next = header.next;
		while(next != null) {
			if(next.next == null){
				Node last = new Node(next.next,null,str);
				next.next = last;
				break;
			}
			next = next.next;

		}

		return next;
	}

	public boolean deleteLast(){

		Node next = header.next;
		boolean result = false;
		while(next != null) {
			if(next.next != null){
				if(next.next.next == null){
					next.next = null;
					result = true;
					break;
				}
				
			}
			next = next.next;
		}
		return result;
	}

	public Node addFirst(String str){
		return this.add(str);
	}
	public boolean deleteFirst(){

		Node next = header.next;
		if(next != null){// no data
			if(next.next == null){// has only one data
				header.next = null;
				return true;
			}else{
				header.next.next.previous = header;
				header.next = header.next.next;
				return true;
			}
		}else{
			return false;
		}
	}

	

	private class Node{
//	class Node{
		public Node previous;
		public Node next;
		public String value;
		public Node(){}
		public Node(Node previous,Node next,String value){
			this.previous = previous;
			this.next = next;
			this.value = value;
		}
	}
}