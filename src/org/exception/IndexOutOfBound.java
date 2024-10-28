package org.exception;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBound {

	public static void main(String[] args) {
		
		List<Integer> a=new ArrayList<Integer>();
		a.add(100);
		a.add(200);
		a.add(300);
		
		Integer integer=a.get(3);
		System.out.println(integer);
		
	}

}
