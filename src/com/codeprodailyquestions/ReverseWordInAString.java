package com.codeprodailyquestions;

import java.util.Scanner;

/**
 *  Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *
 *	Example 1:
 *	Input: "The cat in the hat"
 *	Output: "ehT tac ni eht tah"
 *
 *	Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 *
 *
 * @author mrityunjaykumar
 *
 */
public class ReverseWordInAString {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		for(int i = 0; i < arr.length; i++) {
			StringBuffer sb = new StringBuffer(arr[i]).reverse();
			arr[i] = sb.toString();
		}
		
		StringBuffer sb = new StringBuffer();
	      for(int i = 0; i < arr.length - 1; i++) {
	         sb.append(arr[i]);
	         sb.append(" ");
	      }
	      sb.append(arr[arr.length - 1]);
	      String st = sb.toString();
	      System.out.println(st);

	      sc.close();
	}

}
