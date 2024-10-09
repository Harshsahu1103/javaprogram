package com.basic3DArray;

import java.util.Scanner;

public class Array3DOps {
    public static String arr[][][];
    public Scanner sc = new Scanner(System.in);
    public void creatArray(int scl,int cls,int stu) {
   	 arr=new String [scl][cls][stu];
    }
	public void insertData(int scl,int cls,int stu) {
		System.out.println("collecting student names:");
		for(int i=0;i<scl;i++) {
			System.out.println("inside the school number:"+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("inside the class number:"+(j+1));
				for(int k=0;k<stu;k++) {
					System.out.println("enter students name of number:"+(k+1));
				arr[i][j][k]=sc.next();
				}
			}
			
		}
		System.out.println("Data is loaded on to the array:");
		System.out.println("-------------------------");
	}
//	
//	public void    displayData(int scl,int cls,int stu) {
//		System.out.println("collecting student names:");
//		for(int i=0;i<scl;i++) {
//			System.out.println("inside the school number:"+(i+1));
//			for(int j=0;j<cls;j++) {
//				System.out.println("inside the class number:"+(j+1));
//				for(int k=0;k<stu;k++) {
//					System.out.println("enter students name of number:"+(k+1)+"is="+arr[i][j][k]);
//			
//				}
//			}
//			
//		}
//	
//		System.out.println("-------------------------");
//}
	  public void displayData(int scl, int cls, int stu) {
	        System.out.println("Displaying student names:");
	        for (int i = 0; i < scl; i++) {
	            System.out.println("School number: " + (i + 1));
	            for (int j = 0; j < cls; j++) {
	                System.out.println("Class number: " + (j + 1));
	                for (int k = 0; k < stu; k++) {
	                    System.out.println("Student number " + (k + 1) + ": " + arr[i][j][k]);
	                }
	            }
	        }
	        System.out.println("-------------------------");
	    }
}