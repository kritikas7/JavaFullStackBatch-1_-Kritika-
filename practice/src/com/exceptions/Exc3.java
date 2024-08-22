package com.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exc3 {
	
	public void show() throws FileNotFoundException, InterruptedException{
		FileReader f=new FileReader("c:\\abc.text");
		Thread.sleep(5000);
	}
	public static void main(String[] args)throws FileNotFoundException, InterruptedException {
		Exc3 e1=new Exc3();
		e1.show();
		System.out.println("done");
	}


}
