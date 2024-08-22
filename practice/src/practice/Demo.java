package practice;

import java.util.Scanner;

public class Demo {
	public static void main(String args[]) {
		int x=0;
		while(x<=10) {
			x+=2;
			if (x==4)
				continue;
			System.out.println(x);
		int a[]= {2,23,45,34,23,489};
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum+=a[i];
	}
	System.out.println("sum:"+sum);
	int b[]=new int[5];
	System.arraycopy(a, 0, b, 2, 2);
	for(int i=0;i<b.length;i++)
		System.out.println(b[i]+"")	;
		System.out.println("choose operations + _ * / , 2 numbers");
		Scanner sc=new Scanner (System.in);
		char ch=sc.next().charAt(0);

		int m=sc.nextInt();
		int n=sc.nextInt();
		switch(ch)
		{case '+' : {System.out.println("sum="+(m+n));
		break;
		}
		case '-' : {System.out.println("diff="+(m-n));
		break;
		}
		case '*' : {System.out.println("product="+(m*n));
		break;
		}
		case '/' : {System.out.println("quotient="+(m/n));
		break;
		}
		default: System.out.println("wrong operATOR");
		}
		
		
		
		}}}

