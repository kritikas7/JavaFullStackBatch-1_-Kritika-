package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
	public static void main(String args[]) {
		Set<String> names=new LinkedHashSet<>();
		names.add("Adrian");
		names.add("Niko");
		names.add("Bran");
		names.add("kill");
		System.out.println(names);
		Set<Object> l=new HashSet<>();
		l.add(2);
		l.add(24);
		l.add(32);
		l.add(27);
		l.add(32);
		l.add(54);
		System.out.println(l);
		Iterator i=l.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		l.forEach(x->System.out.println(x));
	}

}
