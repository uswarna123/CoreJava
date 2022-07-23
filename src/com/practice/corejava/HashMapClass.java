package com.practice.corejava;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapClass {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		//hash map only allows unique key value pairs and it also allows null values
		//Adding key value pairs to hash map by using put method
		map.put("Courtney", 33);
		map.put("Jhon", 35);
		map.put("Rebacca", 30);
		map.put(null, null);
		map.put("James", 25);
		map.put("Courtney", 33);
		map.put("Samantha", 28);
		map.put("Tom", 20);
		
		System.out.println("Original Hash Map : "+map);
		
		//removing elements from hash map by using remove method
		map.remove("Samantha");
		map.remove("James", 25);
		System.out.println("After removing some elements from the map : "+map);

		//removing elements from hash map by using remove method
		map.replace("Tom", 20, 38);
		System.out.println("After replacing some elements from the map : "+map);
		
		
		//looping keys through for each loop
		for(String i: map.keySet()) {
			System.out.println("name: "+i);
			
		}
		
		//looping values through for each loop
				for(Integer i: map.values()) {
					System.out.println("Age: "+i);
					
				}

		//looping key & value pairs through for each loop
				for(String i: map.keySet()) {
					System.out.println("Name: "+i+ "," +" Age: "+map.get(i));
					
				}
			
		
	}

}
