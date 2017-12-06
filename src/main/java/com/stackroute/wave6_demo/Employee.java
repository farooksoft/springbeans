package com.stackroute.wave6_demo;

public class Employee {
	private String name;
	private String designation;
	private String gender;
	private int age;
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Employee Name:" +name);
		System.out.println("Designation:" + designation);
		System.out.println("Gender:"+ gender);
		System.out.println("Age:"+age);
	}
}
