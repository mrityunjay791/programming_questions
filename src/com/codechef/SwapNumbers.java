package com.codechef;

public class SwapNumbers {

	public static void swapNumbers(int a, int b) {
		int c = a + b;
		a = c - a;
		b = c - b;
		System.out.println("a: " + a + "  b: " + b);
	}

	public static void swapNumbersWithoutUsingThirdVariable(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a: " + a + "  b: " + b);
	}

	public static void swapNumbersWithoutUsingBitwise(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a: " + a + "  b: " + b);
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		swapNumbers(a, b);
		swapNumbersWithoutUsingThirdVariable(a, b);
		swapNumbersWithoutUsingBitwise(a, b);
	}

}
