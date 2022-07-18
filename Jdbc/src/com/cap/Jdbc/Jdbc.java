package com.cap.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Jdbc  {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub

    
		Class.forName("com.mysql.cj.jdbc.Driver");   //class loader 
		
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root", "root");     //create connection
			
			Statement st = con.createStatement();   //The object used for executing a static SQL statement and returning the results it produces. 
			String query1 = "insert into emp values(5,'akash')";  //Inserting new data in table by using  query1
			String query = "select * from emp";                   
			ResultSet rs = st.executeQuery("SELECT * from emp");   //A table of data representing a database result set
			while(rs.next())
			  {
			    System.out.println(rs.getString(1));  //First Column
			    System.out.println(rs.getString(2));  //Second Column
			  
			  }
			
		   st.executeUpdate(query1);              //Executes the given SQL statement, which may be an INSERT, UPDATE, or DELETE statement or anSQL statement that returns nothing, such as an SQL DDL statement. 
		
		   System.out.println("Student Table created successfully");
		
		
		   // String query2 =(" DELETE FROM emp WHERE emp_id=5;");		//deleting  data in table by using  query2
		   //st.executeUpdate(query2);			
	
		   System.out.println("Row inserted successfully");				
		   st.close();   //closing Statement 

		   con.close();   //closing Connection
		   }
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



