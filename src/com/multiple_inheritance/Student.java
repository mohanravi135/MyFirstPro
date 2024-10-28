package com.multiple_inheritance;

public class Student extends School {
	public void maleStudent() {
		System.out.println("Lakshith M.R");	
	}
	public void femaleStudent() {
		System.out.println("Thoshika M.R");
	}
	public static void main(String[] args) {
		Student W =new Student();
		W.schoolName();
		W.headMaster();
		W.teacher();
		W.maleStudent();
		W.femaleStudent();
		}
}
