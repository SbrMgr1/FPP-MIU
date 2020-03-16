package com.fpp.linkedList;


public class QueueUsingLinkedList {
	private Node header;
	private Node rare;

	public QueueUsingLinkedList() {
		this.header = new Node(null, null);
		this.rare = this.header;
	}

	public boolean enque(String str) {
		
		Node currentNode = new Node(rare, str);
		this.rare.next = currentNode;
		this.rare = currentNode;

		return true;
	}

	private class Node {
		public Node previous;
		public Node next;
		public String value;

		Node(Node previous, String value) {
			this.previous = previous;
			this.next = null;
			this.value = value;
		}

	}

	public String toString() {

		String printStr = "";
		Node next = header.next;
		while (next != null) {
			printStr += next.value + ", ";
			next = next.next;
		}
		printStr = printStr.length() > 2 ? printStr.substring(0, printStr.length() - 2) : printStr;
		return printStr;
	}

}
