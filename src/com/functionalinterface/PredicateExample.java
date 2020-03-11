package com.functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate < Person > predicate = (person) -> person.getAge() > 30;
        boolean result = predicate.test(new Person("ramesh", 32));
        System.out.println(result);
    }
}