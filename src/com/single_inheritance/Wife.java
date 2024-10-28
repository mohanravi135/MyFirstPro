package com.single_inheritance;

public class Wife extends Husband {
	public void spouseName() {
		System.out.println("Revathi Mohan");	
	}
	public static void main(String[] args) {
		Wife W =new Wife();
		W.familyHead();
		W.spouseName();
		}

}
