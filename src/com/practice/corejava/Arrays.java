package com.practice.corejava;

public class Arrays {
	
	public static void main(String args[]) {
	
	//Dog Array created with three items
	  
		DogArray[] dog=new DogArray[3];
	
	//creating an object for each item in an array
	 
		dog[0]=new DogArray();
	    dog[1]=new DogArray();
	    dog[2]=new DogArray();
        getDogName("Huskey");
        setDogName("pug");
        
	}
	

	public static void getDogName(String getName){
		System.out.println("This is a "+getName);
	  			
	}
	public static void setDogName(String setName) {
		System.out.println(setName);
	}

}
