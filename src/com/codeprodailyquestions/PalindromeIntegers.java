package com.codeprodailyquestions;

import java.util.Scanner;

/**
 * Given an integer, check if that integer is a palindrome. For this problem do not convert the integer to a string to check if it is a palindrome.
 *
 * @author mrityunjaykumar
 *
 */
public class PalindromeIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		int tempNum = num;
		int rev = 0;
		while(tempNum > 0) {
			rev = (rev * 10) + tempNum % 10;
			tempNum = tempNum / 10;
		}
		
		if(num == rev) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		sc.close();
	}

}
