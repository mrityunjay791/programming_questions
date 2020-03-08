package com.interview.questions;

import java.util.Scanner;

public class SwapNumberWithoutUsingThirdVariable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number1 value: ");
		
		int num1 = sc.nextInt();
		System.out.print("Enter Number2 value: ");
		int num2 = sc.nextInt();
		System.out.println("Without Swapping Value of Number1: " + num1 + " And Number2: " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("After Swapping Value of Number1: " + num1 + " And Number2: " + num2);
		sc.close();
	}

}
