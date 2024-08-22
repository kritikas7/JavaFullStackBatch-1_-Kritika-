package com.java8;

import java.util.StringJoiner;

public class String1 {
	
	public static void main(String args[]) {
			StringJoiner joinNames = new StringJoiner(",");
			joinNames.add("adrian");
			joinNames.add("Damon");
			joinNames.add("kiril");
			joinNames.add("Niko");
			System.out.println(joinNames);
			System.out.println(joinNames.length());
			StringJoiner s1=new StringJoiner("-");
			s1.add("java");
			s1.add("python");
			System.out.println(joinNames.merge(s1));
			
			
		}

	}


