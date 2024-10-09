package com.OopsProgram;
class elephant{
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
public class Lauch {
	public static void main(String[] args) {
		elephant  e= new elephant();
		e.setName("rocky");
		e.setage(5);
		e.setbreed("tadg");
		e.setcost(4767697);
	
		System.out.println(e.getName());
		System.out.println(	e.getage());
		System.out.println(e.getbreed());
		System.out.println(e.getcost());


	}
}
