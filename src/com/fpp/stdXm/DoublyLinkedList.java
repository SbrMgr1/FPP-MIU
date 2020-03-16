package com.fpp.stdXm;

public class DoublyLinkedList {
	
		Node header;
		
		DoublyLinkedList(){
			header = new Node(null,null,null);
		}
		//adds to the end of the list
		public void addLast(String item){
			//implement
			if(header.next == null) {
				header.next = new Node(item,null,header);				
			}else {
				Node next = header.next;
				while(next.next != null) {
					next = next.next;
				}
				next.next = new Node(item,null,next);
			}
		}
		@Override
		public String toString() {
			
			StringBuilder sb = new StringBuilder();
			toString(sb, header);
			return sb.toString();
			
		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
			toString(sb, n.next);
		}
		
		class Node {
			String value;
			Node next;
			Node previous;

			public Node(String item,Node next,Node previous) {
				this.value = item;
				this.next = next;
				this.previous = previous;
			}
			
			public String toString() {
				return value == null ? "null" : value;
			}
		}
	
		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Steve");
			System.out.println(list);
		}
}
