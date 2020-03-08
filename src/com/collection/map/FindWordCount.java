package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindWordCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		String str2 = sc.nextLine();
		int i = sc.nextInt();
		
		String str = sc.nextLine();
		System.out.println(i+" ; str2="+str2+" str: = "+str);
		
		String[] strArr = str.split(" ");
		
		for(String word: strArr) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			} else {
				map.put(word, 1);
			}
		}
		
		System.out.println(map);
		
		sc.close();
	}

}
