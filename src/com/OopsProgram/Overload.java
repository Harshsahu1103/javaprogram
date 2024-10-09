package com.OopsProgram;


 class Calculater {   
	
  int add (int a,int b) {
	  return a+b;
  }
  
  int add (int a,int b ,int c) {
	  return a+b+c;
  }
  
  
  float add (float a,float b) {
	  return a+b;
  }
  
  float add (float a,int b) {
	  return a+b;
  }
  
	  float add (float a,float b, float c) {
		  return a+b+c;
  }
  double add (double a,double b) {
	  return a+b;
	}
	  double add (double a,int b) {
		  return a+b;
  }
  double add (double a,double b, double c) {
	  return a+b+c;
  }
}
  public class Overload {
	 public static void main(String[] args) {
		 Calculater n = new Calculater();
		System.out.println( n.add(10, 10));
		System.out.println(n.add(9.9, 8.9));
		System.out.println( n.add(8.999999999, 7.6567698));
		System.out.println(  n.add(2, 4, 5));
		System.out.println(  n.add(2.3,4.5, 2.3));
		System.out.println(  n.add(45.234535, 4.87698798798798,5668787.6556786));
		System.out.println(  n.add(4.87679870989, 5687));
		System.out.println(  n.add(3.6, 32));
		 
	 }
	
}
