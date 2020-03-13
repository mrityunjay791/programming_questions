package com.codeprodailyquestions;

/**
 * Given a string, find the longest substring which is palindrome. For example, 
 * if the given string is “forgeeksskeegfor”, the output should be “geeksskeeg”.
 * 
 * @author mrityunjaykumar
 *
 */
public class LongestSubStringPalindrome {

	private static boolean checkPalindrome(String str, int left, int right) {

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {

		String str = "forgeeksskeegfor";
		int max = 0;
		int start = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				boolean isValid = checkPalindrome(str, i, j);
				if (isValid && j - i + 1 > max) {
					max = j - i + 1;
					start = i;
				}
			}
		}
		
		System.out.println(str.substring(start, start+max));
	}

}
