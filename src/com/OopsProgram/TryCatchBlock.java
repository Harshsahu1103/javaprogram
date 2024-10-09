package com.OopsProgram;

import java.util.Scanner;

public class TryCatchBlock {

	public static void main(String[] args) {
//		try {
//			int A=100;
//			int B =0;
//			
//			System.out.println("divded by "+(A/B));
//		} catch (Exception e) {
//  System.out.println("not devidednby reason :" + e);
//		}
		
		int[] arr= {2, 4,5,56,7};
		Scanner sc = new Scanner( System.in);
		System.out.println("enter array size");
		int ind =sc.nextInt();
		System.out.println("enter devided value");
		int num =sc.nextInt();
		try {
			System.out.println("the value of array index is " + arr[ind]);
			System.out.println("the value of devided number is "+arr[ind]/num);
			
		}
		catch (ArithmeticException e) {
System.out.println("the reason ArithmeticException is "+e);
		}
			
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("the reason ArrayIndexOutOfBoundsException is "+e);
					}
		catch (Exception e) {
			System.out.println("the reason ArrayIndexOutOfBoundsException is "+e);
					}
		
		finally {
			System.out.println("finish");
		}
	}
}
