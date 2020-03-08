package com.interview.questions;

class Parent {
	public void m1() {
		System.out.println("Parent method..");
	}
}

class Child extends Parent{
	public void m2() {
		System.out.println("Child method..");
	}
}
public class ParentChildAccess {

	public static void main(String[] args) {
		
		Parent p1 = new Child();
		p1.m1();
	}

}
