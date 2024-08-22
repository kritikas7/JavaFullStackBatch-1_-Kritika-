package com.Jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatement1 {
	public static void main(String args[]) throws ClassNotFoundException,SQLException  {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","kritika");
		System.out.println("Connection success");
		CallableStatement cst=con.prepareCall("{CALL sq4(?,?)}");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		cst.setInt(1, a);
		cst.registerOutParameter(2, Types.INTEGER);
		cst.execute();
		System.out.println("Result from db is: "+cst.getInt(2));
	}
	}
