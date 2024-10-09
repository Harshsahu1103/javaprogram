package javaprogram;
import java.util.Scanner;
public class namepattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value");
		int n = sc.nextInt();
		//System.out.print("value n is :"+n);
		int i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++){
				if(j==0||i==(n/2) ||j==(n-1)||j==(n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
	
		for(j=0;j<n;j++){
				if(i==0 && j!=0 && j!=(n-1)||j==0 && i!=0 ||j==(n-1)&&i!=0||i==(n/2) ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
		
		for(j=0;j<n;j++){
			if( j==0  ||i==0 && j!=(n-1)|| j==(n-1) && i!=0 && i<(n/2)  || i==(n/2) && j!=(n-1)||i==j &&i>=(n/2) ) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print("  ");
	

		for(j=0;j<n;j++){
			if( i==0 && j!=0 ||i==(n/2)&&j!=(n-1)&&j!=0||i==(n-1)&&j!=(n-1)||j==0 &&i<(n/2)&&i!=0||j==(n-1)&&i>(n/2)&&i!=(n-1) ) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print("  ");

	for(j=0;j<n;j++){
			if(j==0||i==(n/2) ||j==(n-1)||j==(n-1)) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		
		System.out.println("");
		
	
	}
		System.out.println("");
		
		for(i=0;i<n;i++) {
		for(j=0;j<n;j++){
			if( i==0 && j!=0 ||i==(n/2)&&j!=(n-1)&&j!=0||i==(n-1)&&j!=(n-1)||j==0 &&i<(n/2)&&i!=0||j==(n-1)&&i>(n/2)&&i!=(n-1) ) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print("  ");	
		
		for(j=0;j<n;j++){
			if(i==0 && j!=0 && j!=(n-1)||j==0 && i!=0 ||j==(n-1)&&i!=0||i==(n/2) ) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print("  ");
		
		for(j=0;j<n;j++){
			if(j==0||i==(n/2) ||j==(n-1)||j==(n-1)) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print("  ");
		
		for(j=0;j<n;j++){
			if( j==0 && i!=(n-1)||j==(n-1)&&i!=(n-1)||i==(n-1)&&j!=0&&j!=(n-1) ) {
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
