package com.codeprodailyquestions;

import java.util.Scanner;

/**
 * 
 * Given a string, find the length of the longest substring without repeating
 * characters.
 *
 * Here is an example solution in Python language. (Any language is OK to use in
 * an interview, though we'd recommend Python as a generalist language utilized
 * by companies like Google, Facebook, Netflix, Dropbox, Pinterest, Uber, etc.,)
 * 
 * @author mrityunjaykumar
 *
 */
public class LongestSubStringWithoutRepeatingCharacter {
	// NOT SOLVED...
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		boolean isCharRepeated = false;
		int max = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {

			isCharRepeated = false;
			int j = i + 1;
			for (j = i + 1; j < len; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					isCharRepeated = true;
					if (max > (j - i)) {
						max = j - i;
					}
					break;
				}
			}

			if (!isCharRepeated) {
				System.out.println(max+" "+ i +" "+ j);
				if (max > (j - i)) {
					max = j - i;
				}
			}
		}

		System.out.println(max);
		sc.close();
	}

}
