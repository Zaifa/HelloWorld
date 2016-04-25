package com.citi.xzf;

public class Teacher {
	private static Student student;

	public static Student getStudent() {
		return student;
	}

	public static void setStudent(Student student) {
		Teacher.student = student;
	}
}
