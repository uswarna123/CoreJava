package com.practice.corejava;

import java.util.LinkedList;

public class LListClass {

	public static void main(String[] args) {
		
     //creating linked list with integer object	
     LinkedList<Integer> iList=new LinkedList<Integer>();
    
     //adding integers to linked list integer object by using add method
     iList.add(14);
     iList.add(15);
     iList.add(50);
     iList.add(6);
     iList.add(null);
     System.out.println("Original LinkedList: "+iList);
     
     //removing an integer from linked list
     iList.remove(2);
     System.out.println("after removing an element in the list: "+iList);
     
     //adding an integer to first & last position of the linked list by using addFirst and addLast method(s)
     iList.addFirst(35);
     iList.addLast(100);
     
     System.out.println("After adding first and last elements to the list: "+iList);
    
     //getting an integers from the list by using getFirst & getLast method(s)
     int first=iList.getFirst();
     System.out.println("First integer in the list :"+first);
     
     int last=iList.getLast();
     System.out.println("Last integer in the list :"+last);
     
     iList.stream().sorted();
     
     //looping linked list through for loop
     
     System.out.println("Size of the Linked List:"+iList.size());
     for(int i=0; i<iList.size();i++) 
     {
    	 System.out.println(iList.get(i));
    	 
     }
     iList.forEach((list)->{System.out.println(list);});
     
     //To remove all the elements in the list by using clear method
     iList.clear();
     
     System.out.println("After clearing all the elements in the list"+iList);
  
     
	}

}
