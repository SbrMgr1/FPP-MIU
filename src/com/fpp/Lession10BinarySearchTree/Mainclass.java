package com.fpp.Lession10BinarySearchTree;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Mainclass {
	public static void main(String[] args) {

			MyBST myBST = new MyBST();
			myBST.insert(15);
			myBST.insert(12);
			myBST.insert(9);
			myBST.insert(56);

			myBST.insert(1);
			myBST.insert(16);
			myBST.insert(19);
			myBST.insert(22);
			myBST.insert(3);
			myBST.insert(100);
			myBST.insert(2);
			myBST.insert(25);
			
			
			System.out.println("Reversal of BST using Pre-Order");
			myBST.printTreePRE();
			System.out.println("--------------\nReversal of BST using In-Order");
			myBST.printTree();
			System.out.println("--------------\nReversal of BST using Post-Order");
			myBST.printTreePOST();
			
			System.out.println("--------------");
			System.out.println("Total number of Nodes:"+myBST.countNodes());
			System.out.println("Total number of Leaves:"+myBST.countleaves());
	}
}
