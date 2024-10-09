package com.basic3DArray;


import java.util.Scanner;

public class Array3Dmain {
	 public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 Array3DOps ao = new Array3DOps();
		 System.out.println("enter the school count:");
		 int scl = sc.nextInt();
		 System.out.println("enter the class count:");
		 int cls =sc.nextInt();
		 System.out.println("enter the students name :");
		 int stu =sc.nextInt();
	     ao.creatArray(scl,cls,stu);
	     ao.insertData(scl,cls,stu);
	     ao.displayData(scl,cls,stu);
	 
	 }

}
