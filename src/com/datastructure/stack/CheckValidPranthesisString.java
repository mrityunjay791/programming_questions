package com.datastructure.stack;

import java.util.Scanner;

class CharNode {
	char ch;
	CharNode next;

	CharNode(char data) {
		this.ch = data;
		this.next = null;
	}
}

public class CheckValidPranthesisString {

	public static CharNode TOP = null;

	public static void push(char data) {
		CharNode new_CharNode = new CharNode(data);
		new_CharNode.next = TOP;

		TOP = new_CharNode;
		
		

	}

	public static void pop() {
		if (TOP == null) {
			System.out.println("No element available to POP..!");
			return;
		}

		TOP = TOP.next;

	}

	public static boolean isEmpty() {
		return TOP == null;
	}
	
	public static char top() {
		return TOP.ch;
	}

	public static void traverse() {
		CharNode tempTop = TOP;
		while (tempTop != null) {
			System.out.print(tempTop.ch + " ");
			tempTop = tempTop.next;
		}
	}

	public static boolean compareTopCharacter(char ch) {
		char topCh = CheckValidPranthesisString.top();

		switch (ch) {
		case ']':
			if (topCh == '[')
				return true;
			else return false;
		case '}':
			if (topCh == '{')
				return true;
			else return false;
		case ')':
			if (topCh == '(')
				return true;
			else return false;
		default:
			return false;
		}

	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string value: ");

		String str = sc.nextLine();


		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '{' || ch == '[' || ch == '(') {
				push(ch);
			} else {
				
				if(TOP == null) {
					System.out.println("Invalid String..!");
					return;
				}
				boolean isValid = compareTopCharacter(ch);
				if(!isValid) {
					System.out.println("Invalid String..!");
					return;
				} else {
					pop();
				}
			}
		}
		
		if(isEmpty()) {
			System.out.println("Valid String");
		} else {
			System.out.println("Invalid string..");
		}


		sc.close();
	}

}
