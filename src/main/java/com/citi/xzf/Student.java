package com.citi.xzf;

public class Student {
	private String name;
	private String id;
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
		System.out.println("Construct with name and id!");
	}

	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("Construct Default!");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
