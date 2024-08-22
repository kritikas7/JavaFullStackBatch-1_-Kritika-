package com.java8;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Fd3 {
	public static void main(String args[]) {
		
		Consumer<Integer> consumer=(a)->System.out.println("square of given num: "+(a*a));
		consumer.accept(3);
		
		Consumer<Double> con=(a)->System.out.println("disc of 10% "+(a*0.10));
		con.accept(30000.00);
		
		Consumer<String> con2=(name)->System.out.println(name.toLowerCase());
		con2.accept("VerIZOn");
		
		Supplier<Integer> s1=()-> new Random().nextInt(1000);
		System.out.println(s1.get());
		
		Predicate<Integer> p=(a)->a%2==0;
		System.out.println(p.test(3));
		System.out.println(p.test(4));
		
		
		Function<Integer, Integer> f=(a)->a*a*a;
		System.out.println(f.apply(7));
		
		Function<String, Integer> f1=(s)->Integer.parseInt(s);
		System.out.println(f1.apply("7")+10);
		}
}
