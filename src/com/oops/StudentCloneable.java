package com.oops;

public class StudentCloneable implements Cloneable {
	private int roll;
	private String name;

	@Override
	public String toString() {
		return "StudentCloneable [roll=" + roll + ", name=" + name + "]";
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public StudentCloneable() {
		super();
	}

	public StudentCloneable(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

}
