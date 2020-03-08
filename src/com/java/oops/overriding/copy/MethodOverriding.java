package com.java.oops.overriding.copy;

abstract class Vehicle {
	public void move() {
		System.out.println("Vehicle class...!");
	}
	
	protected void privateShow() {
		System.out.println("private Show..");
	}
	
	public abstract void m1();
	Vehicle() {
		System.out.println("Contructor of vehicle called...");
	}
}

class Bike extends Vehicle {
	Bike() {
//		super();
		this(10);
		super.privateShow();
		System.out.println("Bike constrctor zero perameterized..");
		
	}
	
	Bike(int x){
		//super();
//		this(12,23);
		System.out.println("Bike constrctor One perameterized..");
	}
	
	Bike(int x, int y) {
		System.out.println("Bike constrctor Two perameterized..");
	}
	
	public void move() {
		System.out.println("Bike class...!");
		super.move();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
}


public class MethodOverriding {
	public final int x;
	
	MethodOverriding() {
		this.x = 10;
//		this.x = 30;
	}
	
	public static void main(String[] args) {
		Bike v = new Bike();
//		MethodOverriding m= new MethodOverriding();
//		System.out.println(m.x);
//		v.move();
	}

}
