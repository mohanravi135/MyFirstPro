package org.java;

public class Finalkey {
	
	final int a=100;
	
	public void dataKey() {
		int b=200;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Finalkey F =new Finalkey();
		F.dataKey();
		
	}

}
