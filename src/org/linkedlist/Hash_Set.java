package org.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {

	public static void main(String[] args) {
		Set<Object> a=new HashSet<Object>();
		a.add(12);
		a.add(43);
		a.add(55);
		a.add(null);
		a.add(true);
		a.add(65);
		a.add(null);
		a.add(65);
		
		System.out.println(a);
		
		int size = a.size();
		System.out.println(size);
		
		boolean contains = a.contains(false);
		System.out.println(contains);
		
		a.clear();
		System.out.println(a);
		
	}

}
