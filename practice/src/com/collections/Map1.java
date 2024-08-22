package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {
	public static void main(String args[]) {
	Map<Integer, String> map1=new HashMap<>();
	map1.put(1, "java");
	map1.put(2, "R");
	map1.put(5, "c");
	map1.put(2, "py");
	map1.put(4, "ja");
	map1.put(7, "sql");
	map1.put(6, "java");
	map1.put(8, null);
	
	System.out.println(map1);
	Set keys=map1.keySet();
	System.out.println(keys);
	
	Collection vals=map1.values();
	System.out.println(vals);
	
	Set kvset=map1.entrySet();
	Iterator i=kvset.iterator();
	while(i.hasNext())
		System.out.println(i.next());
	//Map.Entry entry=(Map.Entry)i.next();
	//System.out.println(entry.getKey()+ " "+entry.getValue());
	
	}
	
}