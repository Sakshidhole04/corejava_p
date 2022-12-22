package com.tns.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tns.util.DButil;

public class Client {

		public static void main(String[] args) throws SQLException
		{
			Connection connection=DButil.getconnection();
			{
				System.out.println("JDBC: connection is establish");
			}
			//addEmployee();
			//updateEmployee();
			//deleteEmployee();
			getEmployee();
		}
		
		private static void addEmployee() throws SQLException
		{
			Connection connection=DButil.getconnection();
			Statement stmt=connection.createStatement();
			String sqlinsert="INSERT INTO EMPLOYEE(Emp_Id,EmpName,EmpAge,EmpDept)"+"values(5,' ishita',30,20)";
			int executeupdate=stmt.executeUpdate(sqlinsert);
			if(executeupdate==1)
			{
				System.out.println("Entry is added");
			}
			
		}
		
		//update
		private static void updateEmployee() throws SQLException
		{
			Connection connection=DButil.getconnection();
			Statement stmt=connection.createStatement();
			String sqlupdate="UPDATE EMPLOYEE SET EmpName='pinu' where Emp_Id=1";
			int executeupdate=stmt.executeUpdate(sqlupdate);
			if(executeupdate==1)
			{
				System.out.println("update is added");
			}
			
		}
		
		//delete
		private static void deleteEmployee() throws SQLException
		{
			Connection connection=DButil.getconnection();
			Statement stmt=connection.createStatement();
			String sqldelete="DELETE FROM EMPLOYEE where Emp_Id=3";
			int executeupdate=stmt.executeUpdate(sqldelete);
			if(executeupdate==1)
			{
				System.out.println("Entry is deleted");
			}
			
		}
		
		//retrive
		private static void getEmployee() throws SQLException
		{
			Connection connection=DButil.getconnection();
			Statement stmt=connection.createStatement();
			//String sqlretrieve="SELECT * FROM EMPLOYEE where Emp_Id=2 ";//for single row retrieve
			String sqlretrieve="SELECT * FROM EMPLOYEE";//whole table retrieval
			ResultSet rs=stmt.executeQuery(sqlretrieve);
			
			//single row retrieve
			/*if(rs.next())
			{
				int Emp_Id=rs.getInt("Emp_Id");
				String EmpName=rs.getNString("EmpName");
				int EmpAge=rs.getInt("EmpAge");
				int EmpDept =rs.getInt("EmpDept");
				System.out.println(Emp_Id+" "+EmpName+" "+EmpAge+" "+EmpDept);
			}
			else
			{
				System.out.println("no result found");
			}*/
			
			//for whole table retrieval
			while(rs.next())
			{
				int Emp_Id=rs.getInt("Emp_Id");
				String EmpName=rs.getNString("EmpName");
				int EmpAge=rs.getInt("EmpAge");
				int EmpDept =rs.getInt("EmpDept");
				System.out.println(Emp_Id+" "+EmpName+" "+EmpAge+" "+EmpDept);
			}
			
		}
		
		
		
		
		
	}












