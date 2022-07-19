package com.cg.Jdbc_1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {
	

	public static void main(String[] args) throws SQLException  
	{
		// TODO Auto-generated method stub

       Connection connection =DBUtil.getconnection();
		
		//checking the connection establishment
		if(connection !=null) 
		{
			System.out.println("JDBC: Connection is established");
		}
		//GetEmployee();              //Retrieve Operation
		//addEmployee();              //Create Operation
		//UpdateEmployee();           //Update Operation
		//DeleteEmployee();           //Delete Operation
		//RetrieveByIdEmployee();     //RetrieveById Operation
		addTable();                 //creating new table Operation
		//addSchema();                //creating new Schema Operation
		
	}
	//creating new Schema Operation
	private static void addSchema() throws SQLException 
	{
		Connection connection =DBUtil.getconnection();
		Statement stmt = connection.createStatement();
		String sqlinsert = "CREATE SCHEMA `rahul` ;";
		int executeupdate = stmt.executeUpdate(sqlinsert);
		if(executeupdate==1 ) 
		{
			System.out.println("Schema is created ");
		}
	}
	//creating new table Operation
	private static void addTable() throws SQLException
	{
		Connection connection =DBUtil.getconnection();
		Statement stmt = connection.createStatement();
		String sqlinsert="CREATE TABLE `rahul`.`std` (\r\n"
				+ "  `std_id` INT NOT NULL,\r\n"
				+ "  `std_name` VARCHAR(45) NOT NULL,\r\n"
				+ "  `std_age` INT NOT NULL,\r\n"
				+ "  PRIMARY KEY (`std_id`));";
		
		int executeupdate = stmt.executeUpdate(sqlinsert);
		if(executeupdate==1 ) 
		{
			System.out.println("Table is created ");
		}
	}
	//Create Operation
	private static void addEmployee() throws SQLException 
	{
		Connection connection =DBUtil.getconnection();
		Statement stmt = connection.createStatement();
		String sqlinsert = "insert into employee(id,name,salary,bonus)" + "values(2,'rajkumar',25000.00,700.00)";
		int executeupdate = stmt.executeUpdate(sqlinsert);
		if(executeupdate==1) 
		{
			System.out.println("Entry is added");
		}
	}
	//Update Operation
	private static void UpdateEmployee() throws SQLException
	{
		Connection connection =DBUtil.getconnection();
		Statement stmt = connection.createStatement();
		String sqlupdate = "update employee set bonus =100.00 where id=2";
		int executeupdate = stmt.executeUpdate(sqlupdate);
		if(executeupdate==1) 
		{
			System.out.println("Update is successfull");
		}
	}
	//Delete Operation
	private static void DeleteEmployee() throws SQLException
	{
		Connection connection =DBUtil.getconnection();
		Statement stmt = connection.createStatement();
		String sqldelete = "delete from employee where id =2";
		int executeupdate = stmt.executeUpdate(sqldelete);
		if(executeupdate==1) 
		{
			System.out.println("Delete is successfull");
		}
	}
		
	//Retrieve Operation
	private static void GetEmployee() throws SQLException 
	{
		Connection connection =DBUtil.getconnection();
		Statement stmt = connection.createStatement();
		String sqlretrieve="Select * from employee";
		ResultSet rs = stmt.executeQuery(sqlretrieve);
		while(rs.next()) 
		{
			int id = rs.getInt("id");
			String name= rs.getString("Name");
			Double salary = rs.getDouble("salary");
			Double bonus = rs.getDouble("bonus");
			System.out.println(id+" "+ name + " " + salary + " " + bonus);
		}
	}
	//RetrieveById Operation
	private static void RetrieveByIdEmployee() throws SQLException 
	{
		Connection connection = DBUtil.getconnection();
		Statement stmt = connection.createStatement();
		String sqlretrieve = "select * from employee where id =2";
		ResultSet rs = stmt.executeQuery(sqlretrieve);
		if(rs.next()) 
		{
			int id = rs.getInt("id");
			String name = rs.getString("name");
			Double salary = rs.getDouble("Salary");
			Double bonus = rs.getDouble("bonus");
			System.out.println(id + " " + name + " "+ salary +" "+ bonus);
		}
		else 
		{
			System.out.println("Employee is not available with the mentioned ID...");
		}
	}
}


