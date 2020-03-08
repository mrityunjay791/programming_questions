package com.collection.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample2 {

	public static void main(String[] args) {
		
		List<Person> person = new ArrayList<>();
		
		Person p1 = new Person(1,"Prince");
		Person p2 = new Person(2,"Rajesh");
		Person p3 = new Person(3,"Santosh");
		Person p4 = new Person(4,"Ganesh");
		Person p5 = new Person(5,"Ramesh");
		
		person.add(p1);
		person.add(p2);
		person.add(p3);
		person.add(p4);
		person.add(p5);
		
		List<String> names = person.stream().map(Person::getName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
	}

}
