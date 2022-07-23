package com.practice.corejava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
        
		
		try {
			//creating a file object
			File file=new File("C:\\Users\\Tenni\\Documents\\Hello.txt");
			
			System.out.println(file);
			//creating a new file
			file.createNewFile();
			System.out.println("File Created "+file.exists());
			
			//writing text into file
			FileWriter mywrite=new FileWriter(file);
			mywrite.write("Hello welcome to a text file of java to create, read and write the files!");
			System.out.println("writing into file ");
			mywrite.close();
			
			//reading text from the file
			Scanner read=new Scanner(file);
			System.out.println("Reading the file");
			
			while(read.hasNext()) {
				
				String data = read.next();
				System.out.println(data);
			
			}
			System.out.println("out side a while loop");
			
			mywrite.close();
			
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   } 	
	}


