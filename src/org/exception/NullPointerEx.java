package org.exception;

public class NullPointerEx {

	public static void main(String[] args) {
		String S=null;
		
		char charAt= S.charAt(1);
		System.out.println(charAt);
	}

}
