package com.Jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1 {
public static void main(String args[]) throws ClassNotFoundException,SQLException  {
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","kritika");
	System.out.println("Connection success");
	Statement st=con.createStatement();
	//st.executeUpdate("create table plan(pid number primary key, planDetails varchar(20), Price number)");
	System.out.println("Table created");
	
	/*st.execute("insert into plan values(1,'friends',34)");
	st.execute("insert into plan values(2,'family',44)");
	st.execute("insert into plan values(3,'team',54)");
	st.execute("insert into plan values(4,'school',24)");
	st.execute("insert into plan values(5,'hospital',64)");*/
	
	//st.execute("delete from plan where pid=5");
	//st.execute("update plan set PlanDetails='orgPlan' where pid=4");
	System.out.println("done..");
	
	ResultSet rs=st.executeQuery("select * from plan where pid=4");
	while(rs.next()) {
		System.out.println(rs.getString(1)+" "+rs.getString(2));
	}
	
}
}
