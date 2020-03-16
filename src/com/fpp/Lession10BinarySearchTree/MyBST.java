package com.fpp.Lession10BinarySearchTree;

public class MyBST {
	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.println(t.element);
			printTree(t.right);
		} // An INORDER Traversal
	}
	public void printTreePRE() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTreePRE(root);
	}
	private void printTreePRE(BinaryNode t) {
		if (t != null) {
			System.out.println(t.element);
			printTreePRE(t.left);
			printTreePRE(t.right);
		} // An INORDER Traversal
	}
	public void printTreePOST() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTreePOST(root);
	}
	private void printTreePOST(BinaryNode t) {
		if (t != null) {
			printTreePOST(t.left);
			printTreePOST(t.right);
			System.out.println(t.element);
		} // An INORDER Traversal
	}
	// Assume the data in the Node is an Integer.
	private int countNodes(BinaryNode root) {
		if (root == null) {
			return 0;
		}else {
			return 1+countNodes(root.left) + countNodes(root.right);
		}
	}
	
	public int countNodes() {
		if (root == null) {
			return 0;
		}else {
			return 1+countNodes(root.left) + countNodes(root.right);
		}
	}
	private int countleaves(BinaryNode root) {
		if (root == null) {
			return 0;
		}else if(root.left == null && root.right == null){
			return 1;
		}else {	
			return countleaves(root.left)+countleaves(root.right);
		}
	}
	public int countleaves() {
		if (root == null) {
			return 0;
		}else if(root.left == null && root.right == null){
			return 1;
		}else {	
			return countleaves(root.left)+countleaves(root.right);
		}
	}

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x, null, null);
			return;
		}

		BinaryNode n = root;
		boolean inserted = false;

		while (!inserted) {
			if (x.compareTo(n.element) < 0) {
				// space found on the left
				if (n.left == null) {
					n.left = new BinaryNode(x, null, null);
					inserted = true;
				}
				// keep looking for a place to insert (a null)
				else {
					n = n.left;
				}
			} else if (x.compareTo(n.element) > 0) {
				// space found on the right
				if (n.right == null) {
					n.right = new BinaryNode(x, null, null);
					inserted = true;
				}
				// keep looking for a place to insert (a null)
				else {
					n = n.right;
				}
			}
		}

	}

	private class BinaryNode {

		// Constructors
		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child
	}
}
