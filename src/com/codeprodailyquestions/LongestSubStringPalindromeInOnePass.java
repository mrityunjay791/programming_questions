package com.codeprodailyquestions;

import java.util.Scanner;

/**
 *  A palindrome is a sequence of characters that reads the same backwards and forwards. Given a string, s, find the longest palindromic substring in s.

	Example:
	Input: "banana"
	Output: "anana"
	
	Input: "million"
	Output: "illi"

 * @author mrityunjaykumar
 *
 */
public class LongestSubStringPalindromeInOnePass {

	int startIndex = 0;
	int length = 0;

	private void expandAndCheck(String str, int left, int right) {

		while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
			left--;
			right++;
		}

		if (length < right - left - 1) {
			startIndex = left + 1;
			length = right - left - 1;
		}
	}

	public static void main(String[] args) {
		LongestSubStringPalindromeInOnePass obj = new LongestSubStringPalindromeInOnePass();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		if(str.length() < 2) {
			System.out.println(str);
			sc.close();
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			obj.expandAndCheck(str, i, i);
			obj.expandAndCheck(str, i, i + 1);
		}

		System.out.println(str.substring(obj.startIndex, obj.startIndex + obj.length));
		
		sc.close();
	}

}
