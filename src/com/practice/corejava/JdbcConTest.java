package com.practice.corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class JdbcConTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		String driverClassName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/studentdb";
		String username="root";
		String pswd="tenni";
		String selectquery="select * from student_db";
		
		//loading and registering driver class
		Class.forName(driverClassName);
		
		System.out.println("DriverClassCreated");
		
		//connecting to database
		Connection con=DriverManager.getConnection(url, username, pswd);
		
		System.out.println("connection Created to database");
		
		//Creating a statement 
		Statement st=con.createStatement();
		
		System.out.println("Statement Created");
		
		//Execute query
		ResultSet rs=st.executeQuery(selectquery);
		System.out.println(" Query Executed");
		
		    //printing result set
		    while(rs.next()) {
		
			int id=rs.getInt(1);
			String name=rs.getString("student_name");
			int age=rs.getInt(3);
			String address=rs.getString("student_address");
			String course=rs.getString(5);
		    System.out.println("Student id:"+id+ ", name:"+name+", age:"+age+
		    		", course:"+course+", address:"+address);
		}
		    
		//inserting Record(s) into db 
	
		try {
		String insert1="INSERT INTO student_db VALUES(4, 'sam' , 25 , 'Austin' , 'MBA')";
		st.executeUpdate(insert1);
		System.out.println("New Record inserted into Database");
		}
		
		
		catch(Exception e) {
			System.out.println("Inserting Record error"+e);
		
		}
		try {
		//deleting record(s) from db 
		
		String delete="DELETE from student_db WHERE student_id=4";
		st.executeUpdate(delete);
		System.out.println("Record deleted from Database");
		}
		catch(Exception e) {
			System.out.println("Deleting Record Error: "+e);
			
		}
		
		//closing connection
        con.close();
        System.out.println("connection to database is closed");
        
	}

}
