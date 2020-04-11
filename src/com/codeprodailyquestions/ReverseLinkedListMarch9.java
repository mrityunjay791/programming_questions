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
 *  1. Given a singly-linked list, reverse the list. This can be done iteratively or recursively. Can you get both solutions?
 *
 *	Example:
 *	Input: 4 -> 3 -> 2 -> 1 -> 0 -> NULL
 *	Output: 0 -> 1 -> 2 -> 3 -> 4 -> NULL
 *	
 *	
 *	2. You are given a singly linked list and an integer k. Return the linked list, removing the k-th last element from the list.
 *
 *	Try to do it in a single pass and using constant space.
 *
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
	
	/**
	 * Added method to delete k-th node from last.
	 * 
	 * @param k
	 */
	private static void deleteKthNodeFromLast(int k) {
		
		Node temp = head;
		int count = 0;
		
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		
		if(k > count || k <= 0) {
			System.out.println("Please enter valid position: ");
			return;
		} else if(count == k) {
			head = head.next;
			return;
		}
		temp = head;
		count = count - k - 1;
		while(count-- != 0) {
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
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
		
		System.out.println();
		deleteKthNodeFromLast(-9);
		traverse();
	}

}
