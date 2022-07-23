package com.practice.corejava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.stream.Stream;

public class FileInputJdbd {
	
	

	static FileReader fr=null;
	static BufferedReader br=null;
	public static void main(String[] args) 
	{
		deleteData();  //Deleting data from data base
		fileToJdbc();   //Storing *.txt file to database

		try {

			fr=new FileReader("C:\\Users\\Tenni\\Documents\\Input.txt");
			br=new BufferedReader(fr);
			Stream<String> data=br.lines();
			Iterator<String> itr= data.iterator();

			while(itr.hasNext()) 
			{
				//System.out.println("Line: "+itr.next());
				String[] split=itr.next().split(",");

				for(int i=0; i<split.length; i++) 
				{
					System.out.println(" Split "+split[i]);
					
					
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		finally {
			try {
				fr.close();
				br.close();
			}catch(Exception e) {
				System.out.println("close Error: "+e);

			}
			
		}
	
       
	}

	public static void deleteData() {
		  Connection con=null;
		  Statement st=null;
		  ResultSet rs=null;
		  
		  PreparedStatement ps=null;
		  try {
   	     //Jdbc connection to mysql db
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "tenni");
		 st=con.createStatement();
		 int count= st.executeUpdate("DELETE FROM employeedb.employee_db;");
		 
		 System.out.println("No.of records deleted table :" +count);
		 
		  }
		  catch (Exception e) {
			
			  System.out.println(e);
           		}
		
	}

	public static void fileToJdbc() 
	{
		  Connection con=null;
		  //Statement st=null;
		  ResultSet rs=null;
		 PreparedStatement ps=null;
		  try {
    	 //Jdbc connection to mysql db
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "tenni");
	     System.out.println("Connection created successfully");
	    
	    
	
	   //input file reader
	    BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Tenni\\Documents\\Input.txt"));
	
	    String id;
	    String name;
	    String state;
	    String str= null;
	   
	    while((str=br.readLine() )!= null) {
	    	//System.out.println("employee table data: "+br.readLine());
	    	String array[]=str.split(",");
	    	       id=array[0];
	    	       name=array[1];
	    	       state=array[2];

	    	try {
	    	       System.out.println("id :"+id+" name: "+name+" state :"+state);
	    	       String query="INSERT INTO employee_db"
	    	       		+ "(employee_id , emplyoee_name , emplyoee_state)"
	    	       		+ "VALUES("+id +",'"+name+ "','"+state+"')";
	    	       ps=con.prepareStatement(query);
	    	       ps.executeLargeUpdate();
	    	     
	    	       System.out.println("Query executed: "+ps);
	    	}
	    	catch(Exception e) 
	    	{
	    		System.out.println(e);
	    		
	    	}   	
	    }
	 
	    System.out.println("Employee Table"+br);
       
       } catch (SQLException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
		  
		}
		
	}
	

