package com.practice.corejava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Stream;

public class HashSetClass {

	public static void main(String[] args) {
       
		
		//hash set allows only unique values and it allows null
		HashSet<String> set=new HashSet<String>();
		set.add(null);
		set.add("apple");
		set.add("orange");
		set.add("banana");
		set.add(null);
		set.add("mango");
		set.add("apple");
		set.remove(null);
		
		Stream<String> item=set.stream();
		
		System.out.println("Steam :"+item.count());
	
		
		System.out.println(set);
		if(set.contains("Orange")) {
			System.out.println("available");
		}
		else
		{
			System.out.println("Not available");
		}
		
		
		//looping through elements by using forEach method and lambda expression 
		//syntax for lambda expression (parameters1,...)->{Code block to execute}
		set.forEach((s)->{System.out.println(s);});
         
		//getting iterator for HashSet
		Iterator<String> it=set.iterator();
	    while(it.hasNext())
	    {
         System.out.println(it.next());
	    	
            }
	}
}