package com.java8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Stream1 {
	public static void main(String args[]) {
		List<Integer>list=Arrays.asList(2,3,15,7,8,93,23,12,34,5,1);
		System.out.println();
		list.stream().sorted().filter(x->x<=20).limit(8).forEach(x->System.out.println(x+" "));
		System.out.println();
		Optional<Integer> max=list.stream().sorted(Collections.reverseOrder()).
				skip(1).findFirst();
		
		if(max.isPresent())
			System.out.println("max: "+max.get());
		String s=null;
		//System.out.println(s.length());
		Optional<String> s1=Optional.ofNullable(null);
		if(s1.isPresent())
			System.out.println(s1.get());
		else
			System.out.println("Empty");
		List<Integer> newList=	Arrays.asList(10,20,30,40,50);
		List<Integer> list2=newList.stream().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		list2.forEach(System.out::println);
		newList.stream().filter(x->x<40).count();
		System.out.println();
		System.out.println();
		
		
	}

}
