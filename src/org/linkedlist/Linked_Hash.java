package org.linkedlist;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hash {

	public static void main(String[] args) {
		
		Set<Object> a =new LinkedHashSet<Object>();
		
		a.add(12);
		a.add(88);
		a.add(45);
		a.add(null);
		a.add(true);
		a.add(65);
		a.add(null);
		a.add(65);
		
		System.out.println(a);
		
		int size =a.size();
		System.out.println(size);
		
		a.remove(5);
		System.out.println(a);
		
		boolean contains = a.contains(false);
		System.out.println(contains);
		
		a.clear();
		System.out.println(a);
		
	}

}
