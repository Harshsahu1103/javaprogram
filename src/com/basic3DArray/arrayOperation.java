package com.basic3DArray;
import java.util.Scanner;
public class arrayOperation {
        public int arr[];
        Scanner sc  = new Scanner (System.in);
        private int size ;
        
        public void createArray() {
        	System.out.println("Enter the array size: ");
        	size = sc.nextInt();
        	arr = new int [size];
        	System.out.println("Array is created");
        	System.out.println("----------------");
        	
        }
        public void insertIntArray() {
        	System.out.println("Enter the array data: ");
            for (int i=0;i<size;i++) {
            	
           arr[i] = sc.nextInt();
        	
        }
            System.out.println("data is inserted into the array");
            System.out.println("-------------------------------");
        }

        public void displayArrayData() {
        	System.out.println(" the array data is : ");
            for (int i=0;i<size;i++) {
            	
        System.out.println(arr[i]);
        	
        }
          
            System.out.println("-------------------------------");
        }
        
        public void updateArrayData() {

        	System.out.println("Enter the position where the new data has to be replaced: ");

        	int pos = sc.nextInt();

        	if(pos < 0 || pos > size) {

        	System.out.println("Invalid position mentioned");

        	}

        	else

        	System.out.println("Enter the new element: ");

        	int ele = sc.nextInt();

        	arr[pos] = ele;

        	System.out.println("Data is updated in the Array");

        	System.out.println(" ---");

        	displayArrayData();

        	}
        
        
}

