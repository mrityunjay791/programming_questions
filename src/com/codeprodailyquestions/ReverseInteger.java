package com.codeprodailyquestions;

import java.util.Scanner;

/**
 * Given an integer, reverse the digits. Do not convert the integer into a string and reverse it.
 * 
 * @author mrityunjayk
 *
 */
public class ReverseInteger {
	
	public static int revInteger(int n) {
		int rev = 0;
		while(n > 0) {
			rev = (rev * 10) + n % 10;
			n /= 10;
		}
		
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		int result = revInteger(n > 0 ? n : -1*n);
		System.out.println("Reversed number is : "+ ((n > 0) ? result: result * -1) );
		sc.close();
	}

}
