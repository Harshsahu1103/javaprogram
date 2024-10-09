package javaprogram;

public class MutabbleimutableExample {
public static void main(String[] args) {
	

	String s1 =new String("Sita");
	String s2 =new String("Rama");
	//s1=s1.concat(s2);
	s1.concat(s2);// can not change directly
	System.out.println(s1);
	
	StringBuffer sb1 =new StringBuffer("Sita");
	StringBuffer sb2 =new StringBuffer("Rama");
    sb1.append(sb2);
    System.out.println(sb1);
    StringBuilder sbl1 =new StringBuilder("SIta");
    StringBuilder sbl2 =new StringBuilder("Rama");
    sbl1.append(sbl2);
    System.out.println(sbl1);

    
}
}