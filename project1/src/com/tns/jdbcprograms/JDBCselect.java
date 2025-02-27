package com.tns.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCselect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		//step 2 load and register the driver
		
		Class.forName("org.postgresql.Driver");
		
		System.out.println("Load is over");
		
		//step 3 establish connection
		
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/teegala","postgres","cherry");
		
		//step 4 create statement
		
		Statement st=con.createStatement();
		
		//step 5 execute query
		
		String strselect="select sname,sbranch from student";
		System.out.println("The sql statement is "+strselect);
		
		//Process the result
		
		ResultSet rs=st.executeQuery(strselect);
		System.out.println("The records are");
		int rowcount=0;
		while(rs.next()) {
			String sname=rs.getString("sname");
			String sbranch=rs.getString("sbranch");
			System.out.println(sname+" "+sbranch);
		}
		
		
	}

}
