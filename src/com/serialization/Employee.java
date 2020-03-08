package com.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int empId= 12;
	String name = "Ramesh";
	transient final String address;
	
	
	public  String getAddress() {
		return address;
	}

//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	

	public Employee(int empId, String name, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	public int getEmiId() {
		return empId;
	}

	public void setEmiId(int emiId) {
		this.empId = emiId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [emiId=" + empId + ", name=" + name + " ,address=" + address + "]";
	}

	
}
