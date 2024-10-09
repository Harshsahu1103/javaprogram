//package com.OopsProgram;
//
//class A{
//	
//	String name;
//	int age;
//	int number;
//	
//    A(){
//    	this.name = "harsh";
//    	this.age = 23;
//    	this.number = 100;
//    }
//    
//	A(String name){
//		this.name = name;
//		this.age = 0;
//		this.number = 0;
//	}
//	
//	A(String name, int age){
//		this.name = name;
//		this.age = age;
//		this.number = 0;
//	}
//	
//	A(String name, int age, int number){
//		this.name = name;
//		this.age = age;
//		this.number = number;
//	}
//	
//	
//    
//}
//
//
//
//public class Constructor {
//public static void main(String[] args) {
//	A a=new A();
//	A b = new A("harsh");
//	
//	System.out.println("difault is: " + a);
//	System.out.println("first name: " + b.name);
//	
//
//
//}
//}






package com.OopsProgram;

class A {
	
    int b; // Declare a field to hold the value of 
    String d;

    A() {
        System.out.println("I am Harsh");
        this.b = 5; // Initialize b in the default constructor
    }

    A(int b) {
        this.b = b; // Initialize b with the provided value
    }

    A(int c, String d) {
        // This constructor does not set the value of b, you may want to do that
        this.b = c; // For example, initialize b with c
        this.d = d;
    }
}

public class Constructor {
    public static void main(String[] args) {
     A c =new A();
    	A a = new A(2);
    	A b = new A(10, "som");
    	System.out.println(a.b);
        System.out.println("constructor: " + b.b +" " + b.d); // Now this will print the value of b
    }
}

