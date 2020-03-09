package com.codeprodailyquestions;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}


/**
 * 
 *  Given a singly-linked list, reverse the list. This can be done iteratively or recursively. Can you get both solutions?

	Example:
	Input: 4 -> 3 -> 2 -> 1 -> 0 -> NULL
	Output: 0 -> 1 -> 2 -> 3 -> 4 -> NULL
 * 
 * @author mrityunjaykumar
 *
 */
public class ReverseLinkedListMarch9 {
	public static Node head = null;
	
	private static void traverse() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data +"->");
			temp = temp.next;
		}
		System.out.print("NULL");
	}
	
	private static void reverseList() {
		Node prev = null;
		Node curr = head;
		Node next = null;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		head = prev;
		
	}
	
	
	private static void reverseListRecurrsive(Node curr, Node prev, Node next) {
		
		if(curr == null) {
			head = prev;
			return;
		}
		
		next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;
		
		reverseListRecurrsive(curr, prev, next);
	}
	public static void main(String[] args) {
		
		Node n = new Node(4);
		head = n;
		Node n2 = new Node(3);
		Node n3 = new Node(2);
		Node n4 = new Node(1);
		Node n5 = new Node(0);
		
		n.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		traverse();
		reverseList();
		System.out.println();
		traverse();
		
		reverseListRecurrsive(head, null, null);
		System.out.println();
		traverse();
	}

}
