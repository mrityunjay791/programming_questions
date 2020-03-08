package com.oops;

public class MethodOverloading {

	public double add(float x, int y) {
		return x+y;
	}
	
	public double add(int x, float y) {
		return x+y;
	}
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		
		System.out.println(m.add(2.5f, 4));
		
		System.out.println(m.add(4, 5.2f));
	}

}
