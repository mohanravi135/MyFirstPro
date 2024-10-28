package org.java;

public class String_Typesmutable {

	public static void main(String[] args) {
		String S1="Mohan";
		String S2="Kumar";
		String S3="R";
		
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
		
		System.out.println(System.identityHashCode(S1));
		System.out.println(System.identityHashCode(S2));
		System.out.println(System.identityHashCode(S3));
		
		String concat =S1.concat(S3);
				System.out.println(concat);
		System.out.println(System.identityHashCode(concat));
		
		System.out.println("<.............................................>");
		StringBuffer a1=new StringBuffer("Red");
		StringBuffer a2=new StringBuffer("White");
		StringBuffer a3=new StringBuffer("Green");
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		System.out.println(System.identityHashCode(a1));
		System.out.println(System.identityHashCode(a2));
		System.out.println(System.identityHashCode(a3));
		
		
		StringBuffer all = a3.append(a1);
		System.out.println(all);
		
		System.out.println(System.identityHashCode(all));
	}

}
