package com.datastructure.stack;

import java.util.Scanner;


public class ReverseStackImplementation {

	public static Node TOP = null;

	public static void push(int data) {
		Node new_node = new Node(data);
		new_node.next = TOP;
		TOP = new_node;

	}

	public static int pop() {
		if (TOP == null) {
			System.out.println("No element available to POP..!");
			return -1;
		}

		Node tempTop = TOP;
		TOP = TOP.next;
		return tempTop.data;

	}

	public static void traverse() {
		Node tempTop = TOP;
		while (tempTop != null) {
			System.out.print(tempTop.data + " ");
			tempTop = tempTop.next;
		}
	}

	public static int top() {
		return TOP.data;
	}
	
	
	public static boolean isEmpty() {
		return TOP == null;
	}
	
	public static void reverseStack() {
		int data;
		if(isEmpty()) {
			return;
		}
		
		data = pop();
		reverseStack();
		pushAtBottom(data);
	}
	
	public static void pushAtBottom(int data) {
		int tempData;
		if(isEmpty()) {
		  push(data);
		  return;
		}
		
		tempData = pop();
		pushAtBottom(data);
		push(tempData);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of elements: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			push(sc.nextInt());
		}

		traverse();
		reverseStack();
		System.out.println();
		traverse();
		sc.close();
	}

}
