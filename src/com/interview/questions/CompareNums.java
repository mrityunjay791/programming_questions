package com.interview.questions;

import java.util.Scanner;

/**
 * W.A.P to compare the two elements without using > and < operator and inbuilt method.
 * 
 * @author mrityunjaykumar
 *
 */
public class CompareNums {

	
	public static void compareNumbersUsingWhileLoop(int num1, int num2) {
		while(true) {
			if(num1 == num2) {
				System.out.println("Num1 and Num2 are equals");
				return;
			}
			num1--;
			num2--;
			if(num1 == 0 || num1 == Integer.MIN_VALUE) {
				System.out.println("Num1 is less than Num2");
				return;
			}
			if(num2 == 0 || num2 == Integer.MIN_VALUE) {
				System.out.println("Num2 is less than Num1");
				return;
			}
		}
	}
	
	public static void compareNumbersUingBitwise(int num1, int num2) {
		int diff = (num1 - num2);
		int res = diff >> 31;
		
		if(num1 == num2) {
			System.out.println("Num1 and Num2 are equals");
			return;
		}
		if(res == 0) {
			System.out.println("Num1 is greater");
		} else {
			System.out.println("Num2 is greater");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two number: ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("\nUsing Bitwise Operator: ");
		CompareNums.compareNumbersUingBitwise(num1, num2);
		
		System.out.println("\nUsing while loop: ");
		CompareNums.compareNumbersUsingWhileLoop(num1, num2);
		
		sc.close();
		
		
	}

}
