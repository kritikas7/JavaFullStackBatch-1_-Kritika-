package com.java8;
import java.util.Arrays;
import java.util.List;

public class Array1 {
	public static void main(String[] args) {
		int a[]= {2,3,5,7,9,11,13};
		for(int x:a)
			System.out.println(x +" ");
		System.out.println();
		Arrays.sort(a);
		
		for(int x:a)
			System.out.println(x+" ");
		System.out.println("Location: "+Arrays.binarySearch(a, 7));
		
		int b[]=new int[6];
		Arrays.fill(b, 23);
		for(int x:b)
		System.out.println(x+ " ");
		
		List<Integer> list=Arrays.asList(1,3,4,5,7,8);
		list.forEach(x->System.out.println(x));
		list.forEach(System.out::println);

}}
