package org.keywords;

public class Keyword extends key {
	
	int a=10;
	
	private void word() {
		
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		Keyword K =new Keyword();
		K.word();
		


	}

}
