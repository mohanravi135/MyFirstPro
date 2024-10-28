package com.multiple_inheritance;

public class School {
	public void schoolName() {
		System.out.println("DonBosco School");
	}
	public void headMaster() {
		System.out.println("Mohan Kumar R");
		}
	public void teacher() {
		System.out.println("Geetha");
		}
	public static void main(String[] args) {
		School S =new School();
		S.schoolName();
		S.headMaster();
		S.teacher();
		
	}

}
