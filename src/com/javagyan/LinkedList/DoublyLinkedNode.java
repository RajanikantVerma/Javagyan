package com.javagyan.LinkedList;

public class DoublyLinkedNode {
	
	int data;
	DoublyLinkedNode nextNode;
	DoublyLinkedNode prevNode;
	
	public DoublyLinkedNode(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "DoublyLinkedNode [data=" + data + "]";
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoublyLinkedNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoublyLinkedNode nextNode) {
		this.nextNode = nextNode;
	}

	public DoublyLinkedNode getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(DoublyLinkedNode prevNode) {
		this.prevNode = prevNode;
	}
	
	

}
