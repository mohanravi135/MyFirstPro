package org.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {

	public static void main(String[] args) {
		List<Object> a =new LinkedList<Object>();
		a.add(22);
		a.add(45);
		a.add(77);
		a.add(null);
		a.add(true);
		a.add(99);
		a.add(null);
		a.add(87);
		
		System.out.println(a);
		
		int size =a.size();
		System.out.println(size);
		
		Object Object =a.get(4);
		System.out.println(Object);
		
		a.set(4, false);
		System.out.println(a);
		
		a.remove(5);
		System.out.println(a);
		
		int indexOf=a.indexOf(45);
		System.err.println(indexOf);
		
		boolean contains =a.contains(false);
		System.out.println(contains);
		
		a.clear();
		System.out.println(a);
		
		
	}

}
