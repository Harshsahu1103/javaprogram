package javaprogram;


interface printtable{
	void print();
	
}

interface printname{
	void name();
}


  class Interface implements printtable, printname{
	  public void print() {
		  System.out.println("Hello");
	  }
	  
	  public void name() {
		  System.out.println("My name is java");
	  }
	 
	 
public static void main(String[] args) {
	
	Interface a = new Interface();
	a.print();
	a.name();
	
}
}
