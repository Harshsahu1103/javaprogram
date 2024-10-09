package com.OopsProgram;

class King{
	private String name;
	private int age;
	private String breed;
	private int cost;
	
	
	
	void setData(String a,int b,String c,int d){
		
		name = a;
		age = b;
		breed = c;
		cost = d;
		
	}
	//  Generic getters and setters
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(breed);
		System.out.println(cost);
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		King e = new King();
		e.setData("rocky", 4, "pug", 7000);
		e.getData();
	}
}
