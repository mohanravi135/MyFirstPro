package org.stringmethod;

public class StringMethodOne {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String s1="Greens";
		String s2="";
		String s3=" ";
		String s4=null;
		
		boolean empty =s1.isEmpty();
		System.out.println(empty);
		

		boolean empty1=s2.isEmpty();
		System.out.println(empty1);
		
		boolean empty2=s3.isEmpty();
		System.out.println(empty2);
		
		boolean empty3=s4.isEmpty();
		System.out.println(empty3);
		
		
	}

}
