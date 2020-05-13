package com.datastructure.linkedlist;

/**
 * 
 * @author mrityunjaykumar
 *
 */
public class Add1ToANumberRepresentedAsLinkedList {
	
	static Node head;
	
	public Add1ToANumberRepresentedAsLinkedList() {
		head = null;
	}
	
	/**
	 * Add node.
	 * 
	 * @param data
	 */
	public static void addNode(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = new Node(data);
	}
	
	/**
	 * Display Node
	 * 
	 */
	public static void printNode() {
		if(head == null) {
			System.out.println("Empty list !");
			return;
		}
		
		Node temp = head;
		
		while(temp.next != null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		
		System.out.print(temp.data);
	}
	
	/**
	 * Reversing list.
	 */
	public static void reverseList() {
		if(head == null) {
			System.out.println("Empty list !");
			return;
		}
		
		Node curr = head;
		Node prev = null;
		Node next = null;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		head = prev;
	}
	
	/**
	 * Adding one digit number to the list.
	 * 
	 * @param digit
	 */
	public static void addDigitToTheList(int digit) {
		if(head == null) {
			System.out.println("Empty list!!");
			return;
		}
		
		int carry = digit;
		Node temp = head;
		while(temp.next != null && carry > 0) {
			int x = temp.data;
			temp.data = (temp.data + carry) % 10;
			carry = (x + carry) / 10;
			temp = temp.next;
		}
		
		temp.data = temp.data + carry;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		addNode(1);
		addNode(9);
		addNode(9);
		addNode(9);
		System.out.println("Original linked list: ");
		printNode();
		reverseList();
		System.out.println("\nAdded one digit number: ");
		addDigitToTheList(1);
		reverseList();
		printNode();
		
	}

}
