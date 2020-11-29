package com.interview.questions.string;

public class CountTheInGivenString {
	static int countWord(String str, String w) {
		String a[] = str.split(" ");

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (w.equalsIgnoreCase(a[i]))
				count++;
		}

		return count;
	}

	public static void main(String args[]) {
		String str = "The republic day is celebrated on january 26 is the day";
		String w = "THE";
		System.out.println("Frequency of word THE in string is "+countWord(str, w));
	}
}