package com.javagyan.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtHead(2);
		list.insertAtHead(12);
		list.insertAtHead(1);
		list.insertAtHead(7);
		list.insertAtHead(78);
		list.insertAtHead(10);

		System.out.println(list.toString());
		System.out.println(list.count());

		list.removeAtHead();

		System.out.println(list.toString());
		System.out.println(list.count());


		System.out.println(list.found(71));
		System.out.println(list.found(7));
	}

}
