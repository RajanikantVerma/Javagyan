package com.javagyan.LinkedList;

public class LinkedList {
	
	Node head;

	@Override
	public String toString() {
		Node current = this.head;
		String s = "{ ";
		
		while(current != null) {
			s+=current.toString() + ",";
			current = current.getNextNode();
		}
		s = s + " }";
		return s;
	}
	
	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}
	
	public int count() {
		int count = 0;
		Node current = this.head;
		while(current != null) {
			count ++;
			current = current.getNextNode();
		}
		return count;
	}
	
	public void removeAtHead() {
		this.head = this.head.getNextNode();
	}
	
	public Node found(int data) {
		Node current = this.head;
		while(current != null) {
			if(current.getData()==data)
				return current;
			current = current.getNextNode();
		}
		return null;
	}

}
