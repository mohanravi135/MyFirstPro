package org.linkedlist;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ListHashMap {

	public static void main(String[] args) {

		Map<Object, Object> m = new HashMap<Object, Object>();

		m.put(78, 'h');
		m.put(34, true);
		m.put("java", null);
		m.put(null, 45);
		m.put(34, 12);
		m.put(null, 67.67);
		m.put(false, 89);
		m.put(89, 12);

		System.out.println(m);

		Object object = m.get(89);
		System.out.println(object);

		Object object1 = m.put(12, object);
		System.out.println(object1);

		Set<Object> keySet = m.keySet();
		System.out.println(keySet);

		Collection<Object> values = m.values();
		System.out.println(values);

		Set<Entry<Object, Object>> entrySet = m.entrySet();
		System.out.println(entrySet);

		boolean containskey = m.containsKey(89);
		System.out.println(containskey);

		boolean containsValue = m.containsValue(12);
		System.out.println(containsValue);

	}

}