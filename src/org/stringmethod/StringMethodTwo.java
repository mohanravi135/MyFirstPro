package org.stringmethod;

public class StringMethodTwo {

	public static void main(String[] args) {
		String s= " Welcome to Greens Technolgy";
		
		String[] split = s.split(" ");
		//System.out.println(split);
		
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
			
		}
		
		

	}

}
