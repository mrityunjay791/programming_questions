package com.interview.questions;

class First {

}

class Second extends First {
	
}

class Third extends Second {
	public Third(int x) {
		System.out.println("c");
	}
}

public class MainClass {
	public static void main(String[] args) {
		Third c = new Third(5);
	}
}
