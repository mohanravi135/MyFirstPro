package com.multilevel_inheritance;

public class Son extends Wife{
	public void sonName() {
		System.out.println("Lakshith M.R");
		
	}

	public static void main(String[] args) {
		Son S =new Son();
		S.familyHead();
		S.spouseName();
		S.sonName();

	}

}
