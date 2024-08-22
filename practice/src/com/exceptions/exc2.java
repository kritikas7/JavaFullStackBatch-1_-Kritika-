package com.exceptions;

import java.io.FileReader;

public class exc2 {
	public static void main(String args[]) {
		FileReader f=null;
		try {
			f=new FileReader("c:\\abc.text");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}finally {
		try {
			f.close();
		}catch(Exception e) {
			
		}
	}

}
