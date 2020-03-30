package Multithreading;

public class MyThread2  extends Thread{
	
	public void run( ) {
		
		for(int i=0; i<10; i++) {
			
			System.out.println("user thread");
			
		}		
	}
	
	public static void main(String[] args) {
		
		MyThread2 myThread2= new MyThread2();
		
		//  will executed  like a normal method
		myThread2.run();
		
		for(int i=0; i<10; i++) {
			
			System.out.println("main thread");
			
			
		}
		
	}

}
