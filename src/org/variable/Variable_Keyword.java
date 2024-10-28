package org.variable;

public class Variable_Keyword extends Key_Word {
	
	int a=100;
	
	public void key() {
		int a=300;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		
	}

	public static void main(String[] args) {
		
		Variable_Keyword VK =new Variable_Keyword();
	VK.key();
	}

}
