package com.java8;

@FunctionalInterface
interface Arith1<T>{
T op(T a,T b);
}
interface Account{
	int getEmi(int amount);
}

public class FunctionalDemo2 {
	public static void main(String args[]) {
		
		
		Account account=(a)->a/12;
		System.out.println(account.getEmi(50000));
		
		Arith1<Integer> arith=( a, b)-> a+b;
		System.out.println(arith.op(3,4));
		
		Arith1<Double> arith1=(a,b)->a*a+b*b;
		System.out.println(arith1.op(2.8,4.6));
		
		Arith1<Float> arith2=(a,b)->a+b*b;
		System.out.println(arith2.op(2f,4f));
	}

}
