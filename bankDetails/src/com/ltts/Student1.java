package com.ltts;

public class Student1 {
	private int stdId;
	private String name;
	private String address;
	public Student1(int stdId, String name, String address) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student1 [stdId=" + stdId + ", name=" + name + ", address=" + address + "]";
	}
	

}
