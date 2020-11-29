package com.interview.questions;

import java.util.Scanner;

public class AddTwoNumberWithoutUsingArithOperator {
	
	
	public static int addTwoNumber(int num1, int num2) {
		
		while(num2 > 0) {
			int carry = num1 & num2;
			num1 = num1 ^ num2;
			num2 = carry << 1;
		}
		
		return num1;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int sum = addTwoNumber(n1, n2);
		System.out.println(sum);
		 System.out.format("%s", sum);
		sc.close();
	}

}
