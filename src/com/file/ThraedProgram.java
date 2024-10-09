package com.file;

//public class ThraedProgram extends Thread {
//	public static void main(String[] args) {
//		ThraedProgram thread =new ThraedProgram();
//		thread.start();
//		System.out.println("i am your first thread");
//	}
//  public void  run () {
//	  
//	  System.out.println("thrad is runnig");
//  }
//}



public class ThraedProgram implements  Runnable {
	public static void main(String[] args) {
		ThraedProgram object =new ThraedProgram();
		Thread thread =new Thread(object);
		thread.start();
		@SuppressWarnings("unused")
		int i = 1;
		while (thread.isAlive()) {
			
			System.out.println("waitting" );
			}
		{
			
			System.out.println("thread is start with implement");
			i++;
		}
	}

	@Override
	public void run() {
		System.out.println("thread is runnning ");
		
	}
}
	
