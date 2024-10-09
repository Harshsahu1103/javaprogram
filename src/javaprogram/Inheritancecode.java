package javaprogram;


class car{
	
protected void start(){
		System.out.println("car  start");
	}
	public void stop(){
		System.out.println("car stop");
	}
}
class toyota extends car{
	 protected void  start(){
			System.out.println("car is start");

	  }
	  public void fule(){
			System.out.println("full fule");

	  }
}

public class Inheritancecode {
public static void main(String[] args) {
	 car a = new car ();
	   toyota A =new toyota();
	   a.start();
	   A.start();
	   a.stop();
	   A.stop();
}
}
