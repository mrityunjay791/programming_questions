package com.interview.questions.string;

public class CheckPalindrome {

	public static boolean isPalindromString(String text) {
		String reverse = reverse(text);
		if (text.equals(reverse)) {
			return true;
		}

		return false;
	}

	public static String reverse(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
	}

	public static void main(String[] args) {
		String str = "aba abcba abcdcba bcd";
		String []strArr = str.split(" ");
		int resLen = 1000;
		String result = "";
		for(int i = 0 ; i < strArr.length; i++) {
			if(isPalindromString(strArr[i]) && strArr[i].length() < resLen) {
				resLen = strArr[i].length();
				result = strArr[i];
			}
		}
		
		if(result.length() > 0) {
			System.out.println("The minimum palindrome is "+ result);
		} else {
			System.out.println("Given string has no palindrome");
		}
	}

}
