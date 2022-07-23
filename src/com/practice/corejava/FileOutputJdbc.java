package com.practice.corejava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class FileOutputJdbc {

	public static void main(String[] args) 
	{

		DBtoFile();

	}

	static void DBtoFile() {

		Connection con=null;

		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "tenni");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM employee_db");
			System.out.println("Select query executed");

			File file=new File("C:\\Users\\Tenni\\Documents\\Employee.txt");
			BufferedWriter bw=new BufferedWriter(new FileWriter(file));

			while(rs.next()) 
			{ 
					  String id=rs.getString(1);
					  String name=rs.getString(2);
					  String state=rs.getString(3);  	
					  bw.write(id +" , ");
					  bw.write(name+" , ");
	                  bw.write(state);	
	                  bw.newLine();
           }
			con.close();
            bw.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}	
	}


}
