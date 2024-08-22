package com.Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;
import java.sql.Statement;

public class jdbc3{

	public static void main(String args[]) throws Exception  {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","kritika");
		System.out.println("Connection success");
		Statement st=con.createStatement();
		PreparedStatement pst=con.prepareStatement("update plan set name=? where pid=?");
		
		System.out.println("enter id for which name to update");
		Scanner sc= new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			pst.setInt(1, sc.nextInt());
			pst.setString(2, sc.next());
			pst.execute();
			System.out.println("after update");
			
			PreparedStatement pst3=con.prepareStatement("delete from plan where pid=?");
			System.out.println("enter id to delete");
			int id3=sc.nextInt();
			pst.setInt(1, id3);
			}
		pst.execute();
		System.out.println("after delete");
		
		PreparedStatement pst2=con.prepareStatement("select * from plan where pid <?");
		System.out.println("enter id to be displayed");
		int id1=sc.nextInt();
		pst2.setInt(id1, id1);
		ResultSet rs1=st.executeQuery("select * from plan");
		}}
