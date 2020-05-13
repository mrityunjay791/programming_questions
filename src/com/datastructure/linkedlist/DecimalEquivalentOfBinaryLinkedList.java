package com.datastructure.linkedlist;

/**
 * Given a singly linked list of 0s and 1s find its decimal equivalent.

   Input  : 0->0->0->1->1->0->0->1->0
   Output : 50   

   Input  : 1->0->0
   Output : 4
   
 * @author mrityunjaykumar
 *
 */
public class DecimalEquivalentOfBinaryLinkedList {
	
	static Node  head;
	static int dec = 0;
	static int count = 0;
	
	public DecimalEquivalentOfBinaryLinkedList() {
		head = null;
	}

	/**
	 * Insert Node.
	 * 
	 * @param data
	 */
	public static void insertNode(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
		
	}
	
	/**
	 * Print Node.
	 */
	public static void printNode() {
		if(head == null) {
			System.out.println("Empty list!");
			return;
		} 
		Node temp = head;
		while(temp.next != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print(temp.data);
	}
	
	/**
	 * Reversing list.
	 */
	public static void reverseList() {
		if(head == null) {
			System.out.println("Empty list!");
			return;
		} 
		
		Node curr = head;
		Node next = null;
		Node prev = null;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		head = prev;
	}
	
	/**
	 * Calculating decimal equivalent of binary.
	 * 
	 * @return
	 */
	public static int calculateBinaryToDecimal() {
		if(head == null) {
			return -1;
		}
		
		Node temp = head;
		int count = 0, decimalVal = 0;
		while(temp != null) {
			decimalVal += temp.data * (int)Math.pow(2, count);
			count++;
			temp = temp.next;
		}
		
		return decimalVal;
	}
	
	/**
	 * Calculating decimal without reversing list.
	 * 
	 * @param head
	 * @param count
	 * @param dec
	 * @return
	 */
	public static int calculateBinaryToDecimalRecursive(Node head) {
		if(head == null)
			return 0;
		 calculateBinaryToDecimalRecursive(head.next);
		 dec += head.data * (int)Math.pow(2,  count);
		 count = count + 1;
		return dec;
		
	}
	
	/**
	 * Convert binary to decimal.
	 * 
	 * @return
	 */
	public static int convertDecialToBinaryList() {
		if(head == null)
			return 0;
		
		Node temp = head;
		int res = 0;
		while(temp != null) {
			res = (res << 1) + temp.data;
			temp = temp.next;
		}
		
		return res;
	}
	
	
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		insertNode(0);
//		insertNode(1);
		insertNode(0);
		insertNode(0);
		insertNode(1);
//		insertNode(1);
//		insertNode(0);
//		insertNode(0);
//		insertNode(0);
		
		printNode();
		
		int res2 = calculateBinaryToDecimalRecursive(head);
		System.out.println("\nValue using recursive: "+res2);
		
		int result = convertDecialToBinaryList();
		if(result != 0) {
			System.out.println("\nDecimal value using iterative and bitwise: "+ result);
		} else {
			System.out.println("\nList is empty!");
		}
		
		reverseList();
		int res = calculateBinaryToDecimal();
		if(res != -1) {
			System.out.println("\nDecimal value using iterative method: "+ res);
		} else {
			System.out.println("\nList is empty!");
		}
		
		
		
	}

}
