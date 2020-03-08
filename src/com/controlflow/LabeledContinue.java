package com.controlflow;

public class LabeledContinue {

	public static void main(String[] args) {
		int[][] table = { { 1, 15, 3 }, { 25, 15, 49 }, { 15, 68, 93 } };
		int loopCycles = 0;
		 
		outer: for (int[] rows : table) {
		    for (int row : rows) {
		        loopCycles++;
		        if (row == 15) {
		            continue outer;
		        }
		    }
		}
		
		System.out.println(loopCycles);
	}

}
