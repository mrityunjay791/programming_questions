package com.datastructure.searching;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Using Collections.binarySearch()
 * 
 * @author mrityunjaykumar
 *
 */
public class BinarySearchUsingCollectionsClass {

	public int runBinarySearchUsingJavaCollections(List<Integer> sortedList, Integer key) {
		int index = Collections.binarySearch(sortedList, key);
		return index;
	}

	public static void main(String[] args) {
		Integer[] sortedArray = { 0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9 };
		int key = 8;

		BinarySearchUsingCollectionsClass binarySearch = new BinarySearchUsingCollectionsClass();
		int index1 = binarySearch.runBinarySearchUsingJavaCollections(Arrays.asList(sortedArray), key);
		System.out.println("Search element found at index : " + index1);
	}

}
