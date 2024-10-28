package org.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Listadd {

	public static void main(String[] args) {
		List<Object> l = new ArrayList<Object>();

		l.add(100);
		l.add(200);
		l.add(300);
		l.add(200);

		List<Object> a = new ArrayList<Object>();

		a.add(400);
		a.add(500);
		a.add(200);

		l.addAll(a);
		System.out.println(l);

	}

}
