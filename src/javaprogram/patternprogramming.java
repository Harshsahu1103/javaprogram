package javaprogram;
import java.util.Scanner;
public class patternprogramming { 
	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter value");
int number = sc.nextInt();
System.out.println("value is :"+number);
//--------ulta pyramid-----
//int i,j,k;
////for(i=number;i>=1;i--) {
//	for(i=1;i<=number;i++) {
//	for(k=1;k<=i;k++) {
//		System.out.print(" ");
//	}
//	for(j=i;j<=number;j++) {
//		System.out.print(j+" *");
//	}
//	System.out.println();
//	
//}
//----------sidha pyramid----
//int i,j,k;
//for(i=1;i<=number;i++) {
//	for(k=1;k<=i;k++) {
//		System.out.print(" ");
//	}
//	for(j=i;j<=number;j++) {
//		System.out.print(" *");
//	}
//	System.out.println();
//	
//}
////-------------number square pattern------------------
//int i,j,c=number;
//for(i=1;i<=number;i++) {
//	c=i;
//
//	for(j=1;j<=number;j++) {
//		if(c<10) {
//		System.out.print("0"+c+" "); 
//		c=c+number;		}
//		else
//		{
//			System.out.print(" "+c);
//			c=c+number;
//		}
//	}
//	System.out.println();
//	
//}

//------------------triangle ulta----------------------
//int i,j;
//for(i=1;i<=number;i++) {
//	for(j=i;j<=number;j++) {
//		System.out.print(" *");
//	}
//	System.out.println();
//	
//}


//------------------------triangle sidha-------------
//int i,j;
//for(i=number;i>=1;i--) {
//	for(j=i;j<=number;j++) {
//		System.out.print(" *");
//	}
//	System.out.println();
//	
//}

//--------trangle abcd pattern--------------
//
//int i,j;
//char c=97;
//char s;
//for(i=1;i<=number;i++) {
//	for(j=1;j<=i;j++) {
//		s=c;
//		System.out.print(s+" ");
//		c++;
//	}
//
//	System.out.println();
//	
//}

//--------------abcd right side--------------
//int i,j,k;
//char c=97;
//char s;
//for(i=1;i<=number;i++) {
//	for(k=1;k<=number-i;k++) {
//		System.out.print(" "+" ");
//	}
//	for(j=1;j<=i;j++) {
//		s=c;
//		System.out.print(" "+s);
//		c++;
//	}
//
//	System.out.println();
//	
//}
//
//int i,j;
//for(i=number;i>=1;i--) {
//	for(j=i;j<=number;j++) {
//		if(i==j||i+j==number+1) {
//		System.out.print(" *");
//		}
//		else {
//			System.out.print(" ");
//		}
//	}
//	System.out.println();
//	
//}


//int i,j,k;
//for(i=1;i<=number;i++) {
//	 for(k=1;k<=number-i;k++) {
//		 System.out.print(" "+" ");
//	 }
//	for(j=i;j>=1;j--) {
//     System.out.print(" "+j);
//	}
//	System.out.println();
//	
//}

//--------------all pattern------------

//int i,j;
//for(i=0;i<number;i++) {
//	for(j=0;j<number;j++){
//		if(i==0||i==(number-1)||j==0||j==(number-1)||i==(number/2)||j==(number/2)||i==j||i+j==(number-1)||i+j==(number/2)||j-i==(number/2)||i-j==(number/2)||i+j==((number-1)+(number/2))) {
//			System.out.print("* ");
//		}
//		else {
//			System.out.print("  ");
//		}
//	}
//	System.out.println("");
//}
//------------ A pattern------------------
int i,j;
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if(i==0 && j!=0&& j!=(number-1)||j==0 && i!=0 ||j==(number-1)&&i!=0||i==(number/2) ) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if(i==0 && j<=number/2||j==0||j==(number/2)||i==(number/2)&&j<=number/2) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

//-------B----------------

for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if(i==0 && j!=(number-1)|| j==0 ||j==(number-1)&&i!=0 && i!=(number-1)&&i!=(number/2)||i==(number/2)&&j!=(number-1) ||i==(number-1)&&j!=(number-1) ) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

//----c---------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if(i==0 && j!=0 || j==0 && i!=0 &&i!=(number-1)||i==(number-1)&&j!=0 ) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}
//-------D---------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if(i==0 &&j!=(number-1) || j==0||i==(number-1)&&j!=(number-1)||j==(number-1)&&i!=0&&i!=(number-1)) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

//-------E-----------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if(i==0 || j==0||i==(number-1)||i==number/2) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}
//---------------F----------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if(i==0 || j==0||i==number/2) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

//--------------------G------------------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if(i==0 && j!=0 || j==0 && i!=0&&i!=(number-1) ||
				i==(number-1)&&j<=(number/2)&&j!=0||
				i==(number/2)&&j>(number/2)&&j!=(number-1)||j==(number/2)&&i>(number/2)||j==(number-1)&& i>(number/2)) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

System.out.println("");
//---------------H---------------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if(j==0||i==(number/2) ||j==(number-1)||j==(number-1)) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}
//-------------I----------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if(i==0||i==(number-1) ||j==(number/2)) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}
  
System.out.println();
//_____J____________
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if(i==0||i==(number-1)&&j<(number/2) ||j==(number/2)||j==0&&i>(number/2)) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}
//----------------K------------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if( j==(number/2) ||i==j && i>=(number/2)||i+j==(number-1)&&i<=(number/2) ) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

//-----L----------------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if( j==0||i==(number-1)) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

System.out.println("");
//----------------M-----------------------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if( j==0 ||i==j && i<=(number/2)||i+j==(number-1)&&i<=(number/2)||j==(number-1) ) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

System.out.println("");
//------------------------N-----------------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if( j==0 ||i==j ||j==(number-1) ) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

System.out.println("");
//---------------------O------------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if( j==0 && i!=0 && i!=(number-1)||j==(number-1) && i!=0 && i!=(number-1) ||i==0 && j!=0 && j!=(number-1)||i==(number-1) && j!=(number-1) && j!=0) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

System.out.println("");
//-------------------P----------------------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if( j==0  ||i==0 && j!=(number-1)|| j==(number-1) && i!=0 && i<(number/2)  || i==(number/2) && j!=(number-1)) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

System.out.println("");
//---------------------Q--------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if( j==0&&i<=(3*number/4) && i!=0 && i!=(3*number/4)||j==(3*number/4)&&i<=(3*number/4) && i!=0 && i!=(3*number/4) ||i==0&&j<=(3*number/4) && j!=0 && j!=(3*number/4)||i==(3*number/4)&&j<=(3*number/4) && j!=(number-1) && j!=0 ||i==j&&i>(number/2)) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}


System.out.println("");
//------R------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if( j==0  ||i==0 && j!=(number-1)|| j==(number-1) && i!=0 && i<(number/2)  || i==(number/2) && j!=(number-1)||i==j &&i>=(number/2) ) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

System.out.println("");
//---------S--------------------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if( i==0 && j!=0 ||i==(number/2)&&j!=(number-1)&&j!=0||i==(number-1)&&j!=(number-1)||j==0 &&i<(number/2)&&i!=0||j==(number-1)&&i>(number/2)&&i!=(number-1) ) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

System.out.println("");
//--------T-----------------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if( i==0||j==(number/2) ) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}
//-------------------------U---------------------------
System.out.println("");

for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if( j==0 && i!=(number-1)||j==(number-1)&&i!=(number-1)||i==(number-1)&&j!=0&&j!=(number-1) ) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}
//-----------V-----------------------
System.out.println("");

for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if( i-j==(number/2) ||j==0 && i<(number/2)||i+j==((number-1)+(number/2)) ||j==(number-1)&& i<(number/2)) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

//--------------W----------------------------
System.out.println("");

for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if( j==0|| j==(number-1)||i==j&&i>=(number/2)||i+j==(number-1)&&i>=(number/2) ) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

System.out.println("");
//---------------------------X--------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if(i==j||i+j==(number-1) ) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

System.out.println("");
//---------------------------Y--------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if(i==j && i<=(number/2)||i+j==(number-1)&&i<=(number/2)||j==(number/2)&&i>=(number/2) ) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println("");
}

System.out.println("");
//---------------------------z--------------
for(i=0;i<number;i++) {
	for(j=0;j<number;j++){
		if(i==0||i+j==(number-1) ||i==(number-1)) {
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