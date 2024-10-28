package org.variable;

public class Variable_Final {
	
	int b=15;
	
	public void data() {
		
		int a=30;
		
		a++;
		b--;
		
		System.err.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Variable_Final vf=new Variable_Final();
		vf.data();
		
	}

}
