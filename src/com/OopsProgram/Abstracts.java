package com.OopsProgram;

abstract class h1{
	void h2() {
		System.out.println("i am h2");
	}
	void h3() {
		System.out.println("i am h3");
	}
	abstract void h4();
	abstract void h6();

}

class h5 extends h1{
	public void h4() {
		System.out.println("hello good morning");
	}
	public void h6(){
		System.out.println("okay");
	}
	
}

public class Abstracts {

	public static void main(String[] args) {
        h5 h =new h5();
        h.h3();
        h.h4();
        h.h6();
	}

}
