package org.linkedlist;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

	public static void main(String[] args) {
		Set<Object> a = new LinkedHashSet<Object>();
		a.add(42);
		a.add(97);
		a.add(60);
		a.add(null);
		a.add(true);
		a.add(55);
		a.add(null);
		a.add(55);

		System.out.println(a);

		int size = a.size();
		System.out.println(size);

		a.remove(5);
		System.out.println(a);

		boolean contains = a.contains(false);
		System.out.println(contains);

		a.clear();
		System.out.println(a);

	}

}
