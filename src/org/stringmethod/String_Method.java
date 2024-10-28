package org.stringmethod;

public class String_Method {

	public static void main(String[] args) {

		
		String S="Hello Java Language";
		
		System.out.println(S);
		
		int length=S.length();
		System.out.println(length);
		
		boolean equals = S.equals("Hellow Java Language");
		System.out.println(equals);
		
		char charAt=S.charAt(4);
		System.out.println(charAt);
		
		boolean equalsIgnoreCase = S.equalsIgnoreCase("Hello Java Language");
		System.out.println(equalsIgnoreCase);
		
		int indexOf =S.indexOf('a');
		System.out.println(indexOf);
		
		int lastIndexOf = S.lastIndexOf('a');
		System.out.println(lastIndexOf);
		
		String upperCase= S.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = S.toLowerCase();
		System.out.println(lowerCase);
		
		boolean contains = S.contains("Java");
		System.out.println(contains);
		
		boolean endwith = S.endsWith("g");
		System.out.println(endwith);
		
		String substring=S.substring(3);
		System.out.println(substring);
		
		String substring1=S.substring(6,11);
		System.out.println(substring1);
		
		String replace = S.replace('J','M');
		System.out.println(replace);
		
		String replace1 = S.replace("Java","Mavan");
		System.out.println(replace1);
		
	}

}
