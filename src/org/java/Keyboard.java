package org.java;

public class Keyboard extends Mouse {
	
	int a=100;
	
	public void key() {
		int a=500;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		
Keyboard K =new Keyboard();
K.key();
	}

}
