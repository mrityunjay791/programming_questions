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
	
	
	
	/**
	 * Finding length of the list using iterative method.
	 * 
	 * @return count
	 */
	public static int findLengthIterative() {
		if(head == null) {
			return 0;
		}
		
		Node temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		
		return count;
	}
	
	/**
	 * Finding length of the list using recursive method.
	 * 
	 * @param head
	 * @return
	 */
	public static int findLengthRecursive(Node head) {
		if(head == null) {
			return 0;
		}
		
		return 1 + findLengthRecursive(head.next);
	}
	
	/**
	 * Find N-th node.
	 * 
	 * @param n
	 */
	public static void getNthNode(int n) {
		if(head == null) {
			System.out.println("Empty list: ");
			return;
		}
		if(n == 0) {
			System.out.println(n+"-th node is: "+ head.data);
			return;
		}
		Node temp = head;
		int count = 0;
		while(temp != null) {
			
			if(count == n) {
				System.out.println(n+"-th node is: "+ temp.data);
				break;
			}
			count++;
			temp = temp.next;
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of elements: ");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n; i++) {
			addLastElement(sc.nextInt());
		}
		
		showList();
//		removeElement(56);
//		reverseList();
		System.out.println();
		showList();
//		createList(sc.nextInt());
//		showList();
		
		int len = findLengthIterative();
		System.out.println("\nLength of the list : "+ len);
		
		int lenUsingRecursive = findLengthRecursive(head);
		System.out.println("Length of the list using recursive: "+ lenUsingRecursive);
		
		getNthNode(3);
		sc.close();
	}

}
