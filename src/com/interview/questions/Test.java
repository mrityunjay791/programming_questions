package com.interview.questions;

public class Test {
	public static int speA(int num1) {

		if (num1 != 0) {
			return (num1 + 2) + speA(num1 - 1);
		} else {
			return 3;
		}
	}

	public static int expeA(int num2) {

		if (num2 != 0) {
			return speA(num2) + expeA(num2 - 1);
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(expeA(5));
	}
}