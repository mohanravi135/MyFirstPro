package org.exception;

public class ArrayIndexoutofBound {

	public static void main(String[] args) {
		
		int[] a=new int[5];
		
		a[0]=10;
		a[1]=20;
		a[3]=30;
		a[4]=40;
		
		System.out.println(a[5]);

	}

}
