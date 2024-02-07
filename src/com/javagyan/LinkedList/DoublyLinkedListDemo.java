package com.javagyan.LinkedList;

public class DoublyLinkedListDemo {
	
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertAtHead(3);
		list.insertAtHead(5);
		list.insertAtHead(1);
		list.insertAtHead(51);
		list.insertAtHead(12);
		
		System.out.println(list.count());
		System.out.println(list.toString());
		
		
		list.removeAtHead();;
		
		System.out.println(list.count());
		System.out.println(list.toString());
	}

}
