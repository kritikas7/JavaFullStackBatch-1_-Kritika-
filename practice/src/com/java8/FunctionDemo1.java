package com.java8;

@FunctionalInterface
interface Arith{
int getSum(int a,int b);
}
public class FunctionDemo1 {
	int getSum(int a, int b) {
		return a+b;
	}
	public static void main(String args[]) {
		FunctionDemo1 f=new FunctionDemo1();
		int result=f.getSum(2,4);
		System.out.println(result);
		System.out.println(f.getSum(3, 4));
		
		Arith arith=(a,b)->a*a+b*b;
		System.out.println(arith.getSum(2,4));

		
	}

}
