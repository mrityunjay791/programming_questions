package com.datastructure.linkedlist;

public class DeleteNNodesAfterMNode {
	static Node head;
	static Node tHead;
	static int noOfNodesToBeSwapped;

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
	
	public static void deleteNNodeAfterMNode(int m , int n) {
		if(head == null) {
			System.out.println("Empty list !! ");
			return;
		}
		Node curr = head;
		while(curr != null) {
		
		
			int tempM = m;
			while(tempM > 1 && curr != null) {
				curr = curr.next;
				tempM--;
			}
			
			
			if(curr == null) 
				return;
			
			int tempN = n;
			while(tempN > 0 && curr.next != null) {
				tempN--;
				curr.next = curr.next.next;
			}
			
			curr = curr.next;
			
		}
		
	}
	
	public static void swapMNodes(Node node, int m) {
		if(node == null)
			return;
		 swapMNodes(node.next, m - 1);
		 if(m <= noOfNodesToBeSwapped) {
			 int temp = tHead.data;
			 tHead.data = node.data;
			 node.data = temp;
			 tHead = tHead.next;
		 }
		 
	}
	
	public static void main(String[] args) {
		addNode(1);
		addNode(2);
		addNode(3);
		addNode(4);
		addNode(5);
		addNode(6);
		addNode(7);
		addNode(8);
		addNode(9);
		addNode(10);
		addNode(11);
	
		int m = 3, n = 2;
		System.out.println("Linked list nodes: ");
		printNode();
		
		System.out.println("\nAfter modification: ");
		deleteNNodeAfterMNode(m, n);
		printNode();
		
		noOfNodesToBeSwapped = 7;
		tHead = head;
		System.out.println();
		swapMNodes(head, 7);
		System.out.println();
		printNode();
	}

}
