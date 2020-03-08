package com.java.oops.coupling;

class Bike {
	
	public void move() {
		System.out.println("Move by Bike..");
	}
}

public class TightCoupling {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.move();
	}

}
