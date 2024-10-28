package org.java;

public class Student {
	
	public Student(int id) {
		System.out.println("Student ID: "+id);
		
	}
	public Student(String name) {
		this(12);
		System.out.println("Student NAME: " +name);
	}
	public Student() {
		this("Mohan");
		System.out.println("Student Details");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		var s = new Student();
		

	}

}
