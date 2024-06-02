package com.traversals;

import java.util.Stack;

public class Traversals {
	public static void main(String []args) {
		
		BinaryTree bt= new BinaryTree();
		BinaryTree.TreeNode root= new BinaryTree.TreeNode("1");
		bt.root= root;
		
		bt.root.left= new BinaryTree.TreeNode("2");
		bt.root.left.left= new BinaryTree.TreeNode("3");
		bt.root.left.right= new BinaryTree.TreeNode("4");
		
		bt.root.right= new BinaryTree.TreeNode("5");
		bt.root.right.right= new BinaryTree.TreeNode("6");
		bt.root.right.left= new BinaryTree.TreeNode("7");
		
		System.out.println("Preorder Traversals :");
		System.out.print("With recursion : ");
		bt.preOrder();
		System.out.print("\nWithout Resursion: ");
		bt.preOrderWithoutRecursion();
		
		System.out.println("\n\nInOrder Traversal :");
		System.out.print("With Recursion : ");
		bt.inOrder();
		System.out.print("\nWithout Recursion : ");
		bt.inOrderWithoutRecursion();
		
		System.out.println("\n\nPostOrder Traversal :");
		System.out.print("With Recursion : ");
		bt.postOrder();
		System.out.print("\nWithout Recursion : ");
		bt.inOrderWithoutRecursion();
		
		System.out.println("\n\nPrint all leaves :");
		bt.printLeaves(root);
	}
}

class BinaryTree {

	static class TreeNode {
		String data;
		TreeNode left, right;

		TreeNode(String data) {
			this.data = data;
			this.left = this.right = null;
		}

		boolean isLeaf() {
			return left == right ? right == null : false;
		}
	}

	TreeNode root;
	
// ---------------------------------------------------------------
	public void preOrder() {
		preOrder(root);
	}

	public void inOrder() {
		inOrder(root);
	}
	
	public void postOrder() {
		postOrder(root);
	}
	
// ---------------------------------------------------------------
	private void preOrder(TreeNode node) {

		if (node == null) {
			return;
		}

		System.out.printf("%s ", node.data);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void inOrder(TreeNode node) {
		
		if(node== null) {
			return;
		}
		
		inOrder(node.left);
		System.out.printf("%s ", node.data);
		inOrder(node.right);
	}
	
	public void postOrder(TreeNode node) {
		
		if(node== null) {
			return;
		}
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.printf("%s ", node.data);
	}
	
// ----------------------------------------------------------------	
	public void preOrderWithoutRecursion() {
		Stack<TreeNode> nodes = new Stack<>();
		nodes.push(root);
		while (!nodes.isEmpty()) {
			TreeNode current = nodes.pop();
			System.out.printf("%s ", current.data);
			if (current.right != null) {
				nodes.push(current.right);
			}
			if (current.left != null) {
				nodes.push(current.left);
			}
		}
	}
	
	public void inOrderWithoutRecursion() {
		Stack<TreeNode> nodes = new Stack<>();
		TreeNode current = root;

		while (!nodes.isEmpty() || current != null) {
			if (current != null) {
				nodes.push(current);
				current = current.left;
			} else {
				TreeNode node = nodes.pop();
				System.out.printf("%s ", node.data);
				current = node.right;
			}
		}
	}
	
	public void postOrderWithoutRecursion() {
		Stack<TreeNode> nodes = new Stack<>();
	    nodes.push(root);
	    
		while (!nodes.isEmpty()) {
			TreeNode current = nodes.peek();
			if (current.isLeaf()) {
				TreeNode node = nodes.pop();
				System.out.printf("%s ", node.data);
			} else {
				if (current.right != null) {
					nodes.push(current.right);
					current.right = null;
				}
				if (current.left != null) {
					nodes.push(current.left);
					current.left = null;
				}
			}
		}
	}
// ----------------------------------------------------------------		
	public void printLeaves(TreeNode node) { 
		
		if (node == null) { 
			 return; 
		 } 
		 
		 if (node.isLeaf()) {
			 System.out.printf("%s ", node.data);
		 } 
		 
		 printLeaves(node.left);
		 printLeaves(node.right); 
	}
}
