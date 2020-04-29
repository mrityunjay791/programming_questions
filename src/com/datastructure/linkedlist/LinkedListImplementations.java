package com.datastructure.linkedlist;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedListImplementations {

	public static Node head = null;

	public static Node createList(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

		return head;

	}

	public static Node reverseList() {
		Node curr = head;
		Node prev = null;
		Node next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		head = prev;

		return head;
	}

	public static void showList() {
		Node temp = head;
		if (temp == null) {
			System.out.println("List is empty..!");
			return;
		}
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("NULL");
	}

	public static void addLastElement(int data) {
		Node node = new Node(data);
		Node temp = head;

		if (temp == null) {
			head = node;
			return;
		}
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = node;

	}
	
	
	public static Node removeElement(int data) {
		Node temp = head;
		Node prev = null;
		
		if(head == null) {
			return null;
		}
		
		while(temp != null && temp.next != null) {
			prev= temp;
			temp = temp.next;
			if(temp != null && temp.data == data) {
				prev.next = temp.next;
				temp = prev;
			}
			
		}
		
		return head;
	}
	
	
	public static void modifyList(Node tempHead, int count, int len) {
		if(tempHead == null) {
			return;
		}
		
		modifyList(tempHead.next,count - 1,len);
		System.out.println(tempHead.data + " => "+ count);
		if(count <= len/2) {
			
			updateValue(tempHead, count);
		}
		
	}
	
	private static void updateValue(Node temp, int pos) {
		Node tempHead = head;
		Node curr = null;
		if(pos == 1) {
			tempHead.data = temp.data - head.data;
			curr = tempHead.next;
			return;
		}
		
		curr.data = temp.data - curr.data;
		curr = curr.next;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of elements: ");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n; i++) {
			addLastElement(sc.nextInt());
		}
		
		showList();
		modifyList(head, n, n);
//		removeElement(56);
//		reverseList();
		System.out.println();
		showList();
//		createList(sc.nextInt());
//		showList();
		sc.close();
	}

}
