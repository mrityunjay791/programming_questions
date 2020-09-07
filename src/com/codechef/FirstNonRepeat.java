package com.codechef;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeat {
	
	public static String findNonRepeatingChar(String str) {
		 Map<Character, Long> collect =  str.chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

	        Optional<Character> firstNonRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
	        if(firstNonRepeat.isPresent()) {
	            return ""+firstNonRepeat.get();
	        }
	        
	        return "NA";
	      
	}

    public static void main(String[] args) {
       System.out.println(findNonRepeatingChar("noon"));
    }
}