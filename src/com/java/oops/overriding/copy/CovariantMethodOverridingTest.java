package com.java.oops.overriding.copy;

import java.util.Date;

public class CovariantMethodOverridingTest {
	public static void main(String args[]) {
		// without covariant overriding, cast at client side needed
		Date d = new Date();
		Date clone = (Date) d.clone();
		// casting required //with covariant method overriding, no client side cast
		Duck duck = new Duck(0xFFFFFF);
		Duck copy = duck.clone(); // no casting
	}
}

class Duck implements Cloneable {
	private int color = 0xFFFFFF;

	public Duck(int color) {
		this.color = color;
	}

	public int getColor() {
		return color;
	}

	@Override
	protected Duck clone() {
		Duck clone = null;
		try {
			clone = (Duck) super.clone();
		} catch (CloneNotSupportedException ex) {
			throw new RuntimeException(ex);
		}
		return clone;
	}
}
