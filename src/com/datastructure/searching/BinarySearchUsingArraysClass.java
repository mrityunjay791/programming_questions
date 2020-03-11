package com.datastructure.searching;

import java.util.Arrays;

/**
 * Using Arrays.binarySearch()
 * 
 * @author mrityunjaykumar
 *
 */
public class BinarySearchUsingArraysClass {

	public int runBinarySearchUsingJavaArrays(int[] sortedArray, Integer key) {
		int index = Arrays.binarySearch(sortedArray, key);
		return index;
	}

	public static void main(String[] args) {
		int[] sortedArray = { 0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9 };
		int key = 8;

		BinarySearchUsingArraysClass binSearch = new BinarySearchUsingArraysClass();
		int index1 = binSearch.runBinarySearchUsingJavaArrays(sortedArray, key);
		System.out.println("Search element found at index : " + index1);
	}
}