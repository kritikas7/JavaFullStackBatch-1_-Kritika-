package com.collections;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Col1 {
	public static void main(String args[]) {
		List l=new ArrayList();
		l.add(34);
		l.add(47.27);
		l.add("java");
		l.add(LocalDate.now());
		l.add(34);
		l.add(56);
		System.out.println(l);
		System.out.println(l.size());
		l.remove(2);
		System.out.println(l.contains("java"));
		System.out.println(l.indexOf("java"));
		System.out.println(l.lastIndexOf("java"));
		System.out.println(l.isEmpty());
		
		ArrayList a1=new ArrayList();
		a1.add(45);
		a1.add(23);
		a1.add(31);
		l.addAll(a1);
		System.out.println("A1 ELEMENTS");
		System.out.println(a1);
		System.out.println(l);
		System.out.println(l.containsAll(a1));
		for(Object o:l)
			System.out.println(o);
		Iterator i=l.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println("lambda");
		l.forEach(x->System.out.println(x));
		
	
		
		
		
		
		
	}

}
