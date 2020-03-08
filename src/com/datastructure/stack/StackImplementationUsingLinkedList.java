package com.datastructure.stack;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class StackImplementationUsingLinkedList {
	public static Node TOP = null;
	

	
	public static void push(int data) {
		Node new_node = new Node(data);
		new_node.next = TOP;
		
		TOP = new_node;
		
	}
	
	public static void pop() {
		if(TOP == null) {
			System.out.println("No element available to POP..!");
			return;
		}
		
		TOP = TOP.next;
		
	}
	
	public static void traverse() {
		Node tempTop = TOP;
		while(tempTop != null) {
			System.out.print(tempTop.data + " ");
			tempTop = tempTop.next;
		}
	}
	
	public static int top() {
		return TOP.data;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of elements: ");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n; i++) {
			push(sc.nextInt());
		}
		
		
		traverse();
		System.out.println("\n"+top());
		pop();
		pop();
		System.out.println("\nAfter 2 pop...");
		traverse();
		
		push(100);
		System.out.println("\nAfter 1 push...");
		traverse();
		System.out.println("\n"+top());
		sc.close();
	}

}
