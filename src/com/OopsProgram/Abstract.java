package com.OopsProgram;

abstract class Animal{
	void h1(){
		System.out.println("hii");
	}
	abstract void hello();
	
	abstract void printinfo();
}

 class Dog extends Animal{
	void printinfo(){
		String name ="Black Dog";
		int legs = 4;
		System.out.println(name);
		System.out.println(legs);
	}
	public void hello() {
		System.out.println("hello");
	}
}

public class Abstract {
	public static void main(String[] args) {
		
		Dog A = new Dog();
        	A.printinfo();
        	A.hello();
        	A.h1();
	} 
}
