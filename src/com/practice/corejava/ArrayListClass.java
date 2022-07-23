package com.practice.corejava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {

	public static void main(String[] args) {
   
	//Creating string array list object with colors
    ArrayList<String> color=new ArrayList<String>();
   
    //adding the color items to array list
    color.add("Red");
    color.add("black");
    color.add("yellow");
    color.add("purple");
    color.add("skyblue");
    color.add("purple");
    
 
    System.out.println("Array list size is: "+color.size());
    System.out.println("Array list elements are: "+color); 
 
    Collections.sort(color);
    System.out.println("After sorting an array list is:"+color);
    
    //updating an array list element by using set method
    color.set(3, "baby pink");
    color.set(4, "blue");
    
    System.out.println("After updating the array list, elements are:"+color);
    
    //Removing an array list element by using remove method
    color.remove(2);
    color.remove("black");
    
    System.out.println("now the list size decreses because we removed element(s)");
    System.out.println("Array list size after removing element(s) is: "+color.size());
    System.out.println("Array list elements are: "+color);
    
     //sorting the array list elements by using sort method of collections class
     Collections.sort(color);
     System.out.println("After sorting an array list is:"+color);
    
    //getting a sublist from the array list by suing sublist method
    System.out.println("sublist of array list is"+color.subList(2, 3));
    
    //looping array list elements through for loop
//    System.out.println("Array list looped through for loop :");
//    for(int i=0; i< color.size(); i++) {
//    
//    	System.out.println(color.get(i));
//    	
//    }
    //looping through array list by forEach method nd lambda Expression 
    // syntax : (parameter1, parameter2,.....)->{block of code to execute}
   color.forEach((n)->{System.out.println(n);});

	}
}
