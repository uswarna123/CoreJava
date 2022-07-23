package com.practice.corejava;

public class Student {
     int sId;
     String sName;
     
	public static void main(String[] args) {
	Student std= new Student();
	std.sId=1;
	std.sName="tenni";
	System.out.println("Student id: "+std.sId+", Student name:"+std.sName);
	
	Student[] std1=new Student[2];
	
	std1[0]=new Student();
	std1[0].sId=2;
	std1[0].sName="adi";
	
	std1[1]=new Student();
	std1[1].sId=3;
	std1[1].sName="rashi";
	
	for(int x=0;x<std1.length;x++) {
		
		System.out.println("student id: "+std1[x].sId +", student name: " +std1[x].sName);
	}
	std.display("tenni");
	display("Adi","Rashi");
	}
   public void display(String name) {
	   System.out.println(" hello "+ name );
   }
   public static void display(String name, String name1) {
	   System.out.println(" hello " + name +" & "+ name1);
   }
   
}
