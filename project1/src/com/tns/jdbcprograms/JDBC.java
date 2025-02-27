package com.tns.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","cherry");
		
		Statement st=con.createStatement();
		
		String strselect="select sname,sbranch from student";
		System.out.println("The sql statement is "+strselect);
		
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
