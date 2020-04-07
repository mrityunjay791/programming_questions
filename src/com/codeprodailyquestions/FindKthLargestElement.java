package com.codeprodailyquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given a list, find the k-th largest element in the list.
 *	Input: list = [3, 5, 2, 4, 6, 8], k = 3
 *	Output: 5
 * 
 * @author mrityunjaykumar
 *
 */
public class FindKthLargestElement {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 2, 4, 6, 8));
		int k = 3;
		Collections.sort(list);
		System.out.println(list.get(list.size() - k));
	}

}
