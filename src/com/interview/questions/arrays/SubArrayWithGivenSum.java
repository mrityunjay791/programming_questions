package com.interview.questions.arrays;

import java.util.Scanner;

/**
 * Given an unsorted array A of size N of non-negative integers, 
 * find a continuous sub-array which adds to a given number S.
 * 
 * Constraints:
	1 <= T <= 100
	1 <= N <= 107
	1 <= Ai <= 1010

 * Example:
	Input:
	2
	5 12
	1 2 3 7 5
	10 15
	1 2 3 4 5 6 7 8 9 10
	Output:
	2 4
	1 5

 * @author mrityunjaykumar
 *
 */
public class SubArrayWithGivenSum {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    if(t >=1 && t <= 100) {
	        for(int tk = 0; tk < t; tk++) {
	            int n = sc.nextInt();
	        int s = sc.nextInt();
	        int arr[] = new int[n];
	        for(int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	            
	        }
	        int sum = 0;
	        boolean isFound = false;
	        for(int i = 0; i < n; i++) {
	            sum = 0;
	            isFound = false;
	            for(int j = i; j < n; j++) {
	                sum += arr[j];
	                if(sum > s) {
	                    break;
	                }
	                if(sum == s) {
	                    isFound = true;
	                    System.out.println((i+1)  + " "+ (j + 1));
	                    break;
	                }
	            }
	            
	            if(isFound) {
	                break;
	            }
	        }
	         if(!isFound) {
	                System.out.println("-1");
	            }
	           
	        
	        }
	    }
	    
	    sc.close();
	}
}
