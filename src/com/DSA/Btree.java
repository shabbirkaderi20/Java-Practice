package com.DSA;


class TreeMap<T> {

    Node<T> root; // Root node of the tree

    // TreeMap constructor
    public TreeMap() {
        root = null; // Initialize root as null
    }

    // Generic Node class
    class Node<T> {
        T data;        // Data stored in the node
        Node<T> left;  // Left child node
        Node<T> right; // Right child node

        // Node constructor
        Node(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // Example method to add a node (you can expand the class with more tree operations)
    public void insert(T data) {
        root = insertRec(root, data);
    }

    // Helper method for insertion
    @SuppressWarnings("unchecked")
	private Node<T> insertRec(Node<T> node, T data) {
        if (node == null) {
            node = new Node<>(data); // Create a new node if current node is null
            return node;
        }

        // Recursively insert to the left or right subtree based on comparison
        if (((Comparable<T>) data).compareTo(node.data) < 0) {
            node.left = insertRec(node.left, data);
        } else if (((Comparable<T>) data).compareTo(node.data) > 0) {
            node.right = insertRec(node.right, data);
        }

        return node;
    }
    
    public void inOrder() {
        inOrderRec(root);
    }

    // Helper method for in-order traversal
    private void inOrderRec(Node<T> node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.print(node.data + " ");
            inOrderRec(node.right);
        }
    }
}

public class Btree {
	
	public static void main(String[] args) {
		
		TreeMap<Integer> tree= new TreeMap<>();
		 	tree.insert(50);
	        tree.insert(30);
	        tree.insert(20);
	        tree.insert(40);
	        tree.insert(70);
	        tree.insert(60);
	        tree.insert(80);
	        
	        tree.inOrder();
	}

}
