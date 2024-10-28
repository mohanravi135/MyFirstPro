package org.mehodoveriding;

public class College extends School {
	
	public void schoolName() {
	super.schoolName();
	System.out.println("Indira Institude of Engg and Technolgy");
	}
	public void area() {
		super.area();
	System.out.println("Thiruvallur");
	}
	public void mediam() {
		super.mediam();
		System.out.println("English");	
	}
	public void classes() {
	super.classes();
	System.out.println("UG &PG");
	}

	public static void main(String[] args) {
		College s = new College();
		s.schoolName();
		s.area();
		s.mediam();
		s.classes();
		
	}

}
