package com.interview.questions.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
 * [Kadane's Algorithm]
 * 
 * 
 * Constraints:
	1 ≤ T ≤ 110
	1 ≤ N ≤ 106
	-107 ≤ A[i] <= 107
	
	Example:
	Input
	2
	5
	1 2 3 -2 5
	4
	-1 -2 -3 -4
	Output
	9
	-1

 * @author mrityunjaykumar
 *
 */
public class MaximumContinuousSubArray {
    
	/**
	 * Used to read input data.
	 * 
	 * @author mrityunjaykumar
	 *
	 */
     public static class InputReader {
	   BufferedReader br;
	   StringTokenizer st;
	   public InputReader(){
	       br = new BufferedReader(new InputStreamReader(System.in));
	   }
	   String next(){
	       try{
   	       if(st == null || !st.hasMoreTokens()){
   	           st = new StringTokenizer(br.readLine());
   	       }
	       } catch (IOException e) {
	               
	       }
	       return st.nextToken();
	   }
	   int intNext(){
	       return Integer.parseInt(next());
	   }
	   long longNext(){
	       return Long.parseLong(next());
	   }
	   double doubleNext(){
	       return Double.parseDouble(next());
	   }
	}
	
     /**
      * Main method.
      * 
      * @param args
      * @throws IOException
      */
	public static void main (String[] args) throws IOException {
	    InputReader in = new InputReader();
	     int t = in.intNext();
	     
	     while(t-- > 0) {
	         int n = in.intNext();
	         int arr[] = new int[n];
	         for(int i = 0; i < n; i++) {
	             arr[i] = in.intNext();
	         }
	         int max = arr[0];
	         int lastMaxVal = arr[0];
	         
	         for(int i = 1; i < n; i++) {
	                max = Math.max(arr[i],arr[i] + max);
	                lastMaxVal = Math.max(max, lastMaxVal);
	            
	         }
	        
	         System.out.println(lastMaxVal);
	         
	     }
	 }
}