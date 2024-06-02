package com.DSA;

public class CustomLL {

	public static void main(String[] args) {
		
		LinkedList list= new LinkedList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.show();

	}

}

class LinkedList {
	
	Node head;
	
	public void add(int data) {
		
		Node node= new Node();
		node.data= data;
		node.next= null;
		
		if(head== null) {
			head= node;
		}else {
			Node n= head;
				
			while(n.next!= null) {
				n= n.next;
			}
			n.next= node;
		}
	}
	
	public void show() {
		
		Node node= head;
		
		do{
			System.out.println(node.data);
			node= node.next;
		}while(node.next!= null);
		
		System.out.println(node.data);
	}
	
	private static class Node {
		int data;
		Node next;	
	}
}

//class LinkedList {
//	
//	private static class Node {
//		
//		int data;
//		Node next;
//		
//		public Node(int data) {
//			
//			this.data= data;
//			next= null;
//		}
//		
//	}
//	
//	Node head;
//	
//	public void add(int node) {
//		
//		Node toInsert= new Node(node);
//		
//		if(head== null) {
//			head= toInsert;
//			return;
//		}else {
//			Node n= head;
//			
//			while(n.next!= null) {
//				n= n.next;
//			}
//			n.next= toInsert;
//		}
//	}
//	
//	public static 
//}