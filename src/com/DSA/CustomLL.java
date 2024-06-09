package com.DSA;

public class CustomLL {

	public static void main(String[] args) {
		
		LinkedList<Companies> list= new LinkedList<>();
		list.add(new Companies(1L, "CG", "EPIP Phase- 2"));
		list.add(new Companies(2L, "IBM", "EGL Kormangala"));
		list.show();
	}

}

class LinkedList<T> {

	Node head;
	Node tail;

	public void add(T data) {
		Node<T> node = new Node<>(data);
		if(head== null && tail== null) {
			head= node;
			tail= node;
		}else {
			tail.next= node;
			tail= node;
		}
	}

	public void show() {
		Node node= head;
		while(node!= tail) {
			System.out.println(node.data);
			node= node.next;
		}
		System.out.println(tail.data);
	}
	
	private static class Node<T> {

		Node prev;
		Node next;
		T data;

		Node(T data) {
			this.data =data;
		}

	}
}

class Companies {

	private Long companyId;
	private String companyName;
	private String companyAddress;

	public Companies(Long companyId, String companyName, String companyAddress) {
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	@Override
	public String toString() {
		return "{companyId=" + companyId +
				", companyName='" + companyName + '\'' +
				", companyAddress='" + companyAddress + '\'' +
				'}';
	}
}