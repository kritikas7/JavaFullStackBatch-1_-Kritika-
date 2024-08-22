package com.exceptions;

public class Exc4 {
	public static void main(String args[]) throws DepositException {
		int amt=999;
		
		if(amt<1000)
			throw new DepositException("min amt is 1000");
		else
			System.out.println("thank you");
	}

}
