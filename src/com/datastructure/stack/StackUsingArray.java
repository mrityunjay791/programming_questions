package com.datastructure.stack;

import java.util.Scanner;

public class StackUsingArray {

	private static int TOP = 0;
	
	public static void push(int stack[] ,int ele) {
		if(TOP < 0) {
			System.out.println("No memory space is available..!");
			return;
		}
		
		if(TOP > 0) {
			TOP--;
		}
		
		stack[TOP] = ele;
		
		
	}
	
	public static void pop(int stack[]) {
		if(TOP >= stack.length) {
			System.out.println("No element available..!");
			return;
		}

		stack[TOP] = Integer.MAX_VALUE;
		if(TOP < stack.length - 1) {
			TOP++;
		}
		
		
	}
	
	public static void traverse(int stack[], int n) {
		
		for(int i = TOP; i < n; i++) {
			System.out.print(stack[i] +" ");
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Enter no of element:" );
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		TOP = n;
		int stack[] = new int[10];
		System.out.println("Enter elements: ");
		
		for(int i = 0; i < n; i++) {
			push(stack,sc.nextInt());
		}
		
		
		traverse(stack, n);
		
		pop(stack);
		pop(stack);
		pop(stack);
		
		System.out.println("\nAfter three pop..");
		traverse(stack, n);
		push(stack,12);
		System.out.println("\nAfter one push..");
		traverse(stack, n);
		
		sc.close();
	}

}
