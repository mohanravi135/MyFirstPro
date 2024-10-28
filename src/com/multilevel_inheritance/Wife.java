package com.multilevel_inheritance;

public class Wife extends Husband {
	public void spouseName() {
		System.out.println("Revathi Mohan N");	
	}
	public static void main(String[] args) {
		Wife W =new Wife();
		W.spouseName();
		}

}
