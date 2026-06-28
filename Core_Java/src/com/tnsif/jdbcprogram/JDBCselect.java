package com.tnsif.jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//demo for jdbc program
//step 1: import the packages
public class JDBCselect {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step2 :Load and register the driver
		
		Class.forName("org.postgresql.Driver");
		System.out.println("step 2 load and driver done");
		
		//Step 3: Establish the connection 
		
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Peenya","postgres","Coders@123");
		System.out.println("connection completed");
		
		//step 4: create a statement
		Statement st=conn.createStatement();
		
		// step 5:Execute the query
		
		String strselect = "select sid, sname, sbranch from library";
		
		System.out.println("the sql staement is "+strselect);
		
		//process the result to display
		
		ResultSet rst=st.executeQuery(strselect);
		
		System.out.println("The records are:");
		int rowcount=0;
		while(rst.next()) {
			int sid=rst.getInt("sid");
			String sname=rst.getString("sname");
			String sbranch=rst.getString("sbranch");
			
			System.out.println(sid+ " "+sname+" "+sbranch);
			++rowcount;
			
//			rst.close();
//			st.close();
//			conn.close();
//			System.out.println("Total rows: " + rowcount);
			
		}
		
	}
}
