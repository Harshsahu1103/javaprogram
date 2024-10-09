package javaprogram;

import java.util.Scanner;

public class massagepattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value");
		int n = sc.nextInt();
		//System.out.print("value n is :"+n);
		int i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++){
				if( j==0&&i<=(3*n/4) && i!=0 && i!=(3*n/4)||j==(3*n/4)&&i<=(3*n/4) && i!=0 && i!=(3*n/4) ||i==0&&j<=(3*n/4) && j!=0 && j!=(3*n/4)||i==(3*n/4)&&j<=(3*n/4) && j!=(n-1) && j!=0 ||i==j&&i>(n/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
}
}
