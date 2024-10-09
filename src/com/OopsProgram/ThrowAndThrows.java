package com.OopsProgram;


public class ThrowAndThrows {
	public static double aera 	(int r) {
		double result = Math.PI *r*r;
		return result;
	}
	public static int divide(int a, int b )throws ArithmeticException {
		int result = a/b;
		return result;
	}
	public static void main(String[] args) {
		try {
			int c = divide(6,0);
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

