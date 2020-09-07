package com.leetcode.practice.binarysearch;

/**
 * 
 * @author mrityunjayk
 *
 */
class SqrtUsingBinarySearch {

	public static void main(String[] args) {
		int num = 4;
		System.out.println("Square root of the " + num + " is : " + mySqrt(num));
	}

	public static int mySqrt(int x) {
		if (x < 2) {
			return x;
		}

		int left = 0;
		int right = x;

		while (left < right) {
			int mid = (int) (left + Math.floor((right - left) / 2));

			if (mid * mid == x) {
				return mid;
			} else if (mid * mid > x) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}

		return left - 1;
	}
}