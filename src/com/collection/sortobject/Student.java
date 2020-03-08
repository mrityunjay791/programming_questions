package com.collection.sortobject;

public class Student implements Comparable<Student>{

	private int id;
	private String name;
	private String address;
	private int rollNo;

	public Student(int id, String name, String address, int rollNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.rollNo = rollNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", rollNo=" + rollNo + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.getAddress().compareTo(o.getAddress());
	}

}
