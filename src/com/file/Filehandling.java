package com.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;




public class Filehandling {

public static void main(String[] args) {
	   		 
	      
		//create a file
//			 try {
//					String PathName=null;
//					File myFile =new File(PathName, "h111111file.txt");
//				 myFile.createNewFile(); 
//				 System.out.println("file create");
//			 }
//			 catch ( IOException e) {
//				System.out.println("unable to create");
//				e.printStackTrace();
//			}
	
	//write a file
//	try {
//		
//		String fileName = null;
//		FileWriter  fileWriter =new FileWriter(fileName= "h111111file.txt");
//		fileWriter.write("this is my file");
//	fileWriter.write("this is hk world");
//		fileWriter.close();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	
	
	
	//read
//	String pathname = null;
//	File myFile =new File(pathname, "h111111file.txt");
//	try {
//		Scanner sc = new Scanner(myFile);
//		while (sc.hasNextLine()) {
//				String line =sc.nextLine();
//				System.out.println(line);
//		}
//		sc.close();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
	//delete
	
	
	
	String pathname = null;
	File myFile =new File(pathname, "h111111file.txt");
	if(myFile.delete()) {
		System.out.println("i have deleted "+myFile.getName());
	}
	else {
		System.out.println("some proiblem occured");
	}
}
}


