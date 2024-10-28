package org.variable;

public class Variable {
	static int a=111;
	
	
	public void data() {
		int b=222;
		char c='R';
		System.out.println(b);
		System.out.println(c);
	}
	
	static {
		System.out.println("  Hello Mohan  ");
	}
	
	public static void main(String[] args) {
Variable Va =new Variable();
		Va.data();
		System.out.println(a);	
	}

}
