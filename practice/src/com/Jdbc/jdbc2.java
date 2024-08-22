package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;
import java.sql.Statement;

public class jdbc2 {
	public static void main(String args[]) throws Exception  {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","kritika");
		System.out.println("Connection success");
		Statement st=con.createStatement();
		PreparedStatement pst=con.prepareStatement("insert into plan values(?,?)");
		
		System.out.println("enter 3 plan records : id,name");
		Scanner sc= new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			pst.setInt(1, sc.nextInt());
			pst.setString(2, sc.next());
			pst.execute();		
			}
	ResultSet rs=st.executeQuery("select * from plan");
	ResultSetMetaData rsmd=rs.getMetaData();
	System.out.println(rsmd.getColumnCount());
	for(int i=1;i<=rsmd.getColumnCount();i++)
	System.out.println(rsmd.getColumnName(i)+" ");
	while(rs.next()) {
		System.out.println(rs.getString(1)+" "+rs.getString(2));
	}
	
	
	}
}
