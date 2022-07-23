package com.practice.inheritence;

public class Department extends Student {
	
	void display(String name) 
	{
	
		System.out.println("am department name= "+name);
	}
    static void display(String name, int id) 
    {
    	studentId(name,id);
    	System.out.println("Department name ="+name +" Department id= "+id);
    }
    
    
}
