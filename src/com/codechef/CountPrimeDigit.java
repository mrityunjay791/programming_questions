package com.codechef;

import java.util.HashMap;
import java.util.Map;

public class CountPrimeDigit {
	public static Map<Integer, Integer> countDigit(int n) {
	 Map<Integer, Integer> map = new HashMap<>(); 
        int temp = n; 
        while (temp != 0) { 
            int d = temp % 10; 
            temp /= 10; 
      
            if (d == 2 || d == 3
                || d == 5 || d == 7) {
            	map.putIfAbsent(d, map.getOrDefault(d, 0) + 1);
            } else {
            	map.putIfAbsent(d, map.getOrDefault(d, 0) + 1);
            }
            	
        } 
      
        return map; 
    } 
	
	public static void main(String[] args) {
		int count = 0;
		int L = 30, R=50;
		for(int i = L; i <= R; i++) {
			
			Map<Integer, Integer> map = countDigit(i);
			if(map.getOrDefault(2, 0) >= map.getOrDefault(3, 0) && map.getOrDefault(3, 0) >= map.getOrDefault(5, 0) && map.getOrDefault(5, 0) >= map.getOrDefault(7, 0)) {
				count++;
				System.out.println(i);
			} 
			
			
		}
		
		System.out.println(count);
		
	}

}
