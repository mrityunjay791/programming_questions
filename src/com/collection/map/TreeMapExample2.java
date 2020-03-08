package com.collection.map;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class TreeMapExample2 {

	public static void main(String[] args) {
		
		Map<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(1, "a");
		treeMap.put(2, "a");
		treeMap.put(9, "a");
		treeMap.put(7, "a");
		treeMap.put(4, "a");
		treeMap.put(3, "a");
		
		System.out.println(treeMap);
		
//		Queue<Integer> que = new LinkedList<>();
		BlockingQueue<Integer> que = new PriorityBlockingQueue<>();
		
		que.add(4);
		que.add(6);
		que.add(10);
		que.add(14);
		que.add(16);
		que.add(17);
		
		que.remove();
		
		System.out.println(que);
		
		
		List<Integer> list = new LinkedList<>();
		
		list.add(4);
		list.add(6);
		list.add(10);
		list.add(14);
		
		
		System.out.println(que);
		
		String val = "ABC";
		String val2 = "BAA";
		Integer k = 8;
		Character ch = 'Z';
		Person p = new Person(1,"prince");
		System.out.println(ch.hashCode() +" "+
				val.hashCode()+" "+ val2.hashCode() + " => " +p.hashCode() +" ,k ="+ k.hashCode() );
		
		
		
		
		
		
		
	}

}
