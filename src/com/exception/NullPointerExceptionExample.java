package com.exception;
public class NullPointerExceptionExample {

    public static void main(String[] args) {

    	String title = "Baeldung"; 
    	String formatted = String.format("Title is %s", title);
    	
    	System.out.println(formatted);
        Person personObj = null;

        try {
            String name = personObj.personName; // Accessing the field of a null object
            personObj.personName = "Jon Doe"; // Modifying the field of a null object
        } catch (NullPointerException e) {
            System.err.println("NullPointerException caught!");
        }

    }
}

class Person {

    public String personName;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

}