package com.javagyan.LinkedList;

public class DoublyLinkedList {
	
	DoublyLinkedNode head;
	
	public void insertAtHead(int data) {
		DoublyLinkedNode node = new DoublyLinkedNode(data);
		node.setNextNode(this.head);
		if(this.head!=null) {
			node.setPrevNode(node);
		}
		this.head = node;
	}
	
	public int count() {
		DoublyLinkedNode current = this.head;
		
		int count =0;
		while(current!= null) {
			count ++;
			current = current.getNextNode();
		}
		return count;
	}

	@Override
	public String toString() {
		DoublyLinkedNode current = this.head;
		
		String s = "{ ";
		while(current != null) {
			s+= current.toString() + ", ";
			current = current.getNextNode();
		}
		s+= "}";
		return s;
	}
	
	public void removeAtHead() {
		this.head = this.head.getNextNode();
	}

}
