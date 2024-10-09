//package javaprogram;
//
//public class sum {
//	
//	
//	public int sum(int x,int y);
//	  {
//		  return(x+y);
//	  }
//	  public int sum(int x, int y, int z);
//	  {
//		  return(sum);
//	  }
//	 
//
//
//public static void main(String[] args) {
//	  sum s =new sum();
//	int addition  = s.sum(5, 8);
//	int addition1  = s.sum(5, 8,9);
//	System.out.println(addition);
//	System.out.println(addition1);
//}
//}

package javaprogram;

public class sum {

    // Method to sum two integers
    public int sum(int x, int y) {
        return (x + y);
    }

    // Method to sum three integers
    public int sum(int x, int y, int z) {
        return (x + y + z);
    }

    public static void main(String[] args) {
        sum s = new sum();
        int addition = s.sum(5, 8);      // Sum of two integers
        int addition1 = s.sum(5, 8, 9);  // Sum of three integers
        System.out.println(addition);     // Output: 13
        System.out.println(addition1);    // Output: 22
    }
}
