package com.OopsProgram;

class Cat{
	private String name;
	private int age;
	private String breed;
	private int cost;
//specific getters and setters 

void setName(String name)
{
	this.name=name;
	
}
void setage(int age)
{
	this.age=age;
	
}
void setbreed(String breed)
{
	this.breed=breed;
	
}
void setcost(int cost)
{
	this.cost=cost;
	
}

String getName() {
	return name;
}
int getage() {
	return age;
}
String getbreed() {
	return breed;
}
int getcost() {
	return cost;
}
}

public class Ecapsulation2 {
public static void main(String[] args) {
	Cat c= new Cat();
	c.setName("tommy");
	c.getName();
	c.setage(4);
	c.setbreed("ind");
	c.setcost(2000);
	c.getage();
	c.getbreed();
	c.getcost();
	System.out.println(c.getName());
	System.out.println(	c.getage());
	System.out.println(c.getbreed());
	System.out.println(c.getcost());


}
}
