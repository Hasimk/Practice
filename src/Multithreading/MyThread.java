package Multithreading;

public class MyThread  extends Thread{
	
	public void run() {
		
		for(int i=0; i<10; i++) {
			
			System.out.println("user thread");
		}
	}
	
	public static void main(String[] args) { //main thread
		
		//user thread starting code
		MyThread myThread= new MyThread();
		
		myThread.start();
		
		//Logic for Main Thread
		for(int i=0; i<10; i++) {
			
			System.out.println("Main Thread");
			
			
		}
	}

}
