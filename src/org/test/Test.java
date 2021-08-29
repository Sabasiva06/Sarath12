package org.test;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// 1D without header
		List<String> li = new ArrayList<String>();
		li.add("A");
		li.add("B");
		li.add("C");
		li.add("d");
		li.add("e");

		String string = li.get(2);
		System.out.println(string);

		// 1D with header
		Map<String, String> mp = new LinkedHashMap<>();
		mp.put("username", "Saba");
		mp.put("email", "saba@gmail.com");
		mp.put("location", "Chennai");

		String string2 = mp.get("location");
		System.out.println(string2);

		// 2D without header
		List<ArrayList<String>> l = new ArrayList<>();
		ArrayList<String> a = new ArrayList<>();
		a.add("saba");
		a.add("saba@gmail.com");
		a.add("chennai");

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("vel");
		a1.add("vel@gmail.com");
		a1.add("chennai");

		ArrayList<String> a2 = new ArrayList<>();
		a2.add("siva");
		a2.add("siva@gmail.com");
		a2.add("coimbatore");

		l.add(a);
		l.add(a1);
		l.add(a2);

		ArrayList<String> arrayList = l.get(1);
		String string3 = arrayList.get(1);
		System.out.println(string3);

		// 2D with header
		List<LinkedHashMap<String, String>> m = new ArrayList<>();
		LinkedHashMap<String, String> ll = new LinkedHashMap<>();
		ll.put("username", "Saba");
		ll.put("email", "saba@gmail.com");
		ll.put("location", "Chennai");

		LinkedHashMap<String, String> ll1 = new LinkedHashMap<>();
		ll1.put("username", "Vels");
		ll1.put("email", "Vels@gmail.com");
		ll1.put("location", "Chennai");

		LinkedHashMap<String, String> ll2 = new LinkedHashMap<>();
		ll2.put("username", "Siva");
		ll2.put("email", "siva@gmail.com");
		ll2.put("location", "Coimbatore");
		
		m.add(ll);
		m.add(ll1);
		m.add(ll2);
		
		LinkedHashMap<String, String> linkedHashMap = m.get(2);
		String string4 = linkedHashMap.get("location");
		System.out.println(string4);
	}

}
