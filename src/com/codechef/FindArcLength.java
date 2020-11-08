package com.codechef;

public class FindArcLength {
    
	public static int findArcLength(int A, int R) {
		int arcLength = 0;
		if (A > 360) { 
            System.out.println("Invalid angle"); 
        } 
        else { 
        	arcLength = (int) Math.floor((2 * 3.14 * R) * (A / 360.0));
        }
		return arcLength;
	}
	public static void main(String[] args) {
		int A = 300;
		int R = 45;
		System.out.println("Result: "+ findArcLength(A, R));
	}

}
