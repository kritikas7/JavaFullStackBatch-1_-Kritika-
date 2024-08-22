package com.exceptions;

public class exc1 {
	public static void main(String args[]) {
	int a=2;
	int b=0;
	int s[]= {2,3,4,5};
	
	try {try {
		System.out.println(s[5]);
	} catch (Exception e) {
		System.out.println(e);
	}
		int c=a/b;
		System.out.println("result: "+c);
	}
	catch(Exception e) {
		System.out.println(e);
		
	}
	
	
	}
}
