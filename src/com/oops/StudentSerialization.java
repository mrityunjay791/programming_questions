package com.oops;

import java.io.Serializable;

public class StudentSerialization implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private transient int roll;
	
	private String name;
	
	

	public StudentSerialization(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
