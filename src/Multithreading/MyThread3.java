package Multithreading;

public class MyThread3 extends Thread{
	

	public void run() {
		
		for(int i=0;  i<10; i++) {
			
			System.out.println("0-argument user thread");
		}
		
		run(10);
		
	}
public void run(int a) {
		
		for(int i=0;  i<10; i++) {
			
			System.out.println("1-arguument user thread");
		}
		
	}

public static void main(String[] args) {
	
	MyThread3 myThread3 = new MyThread3();
	myThread3.start();
	for(int i=0;  i<10; i++) {
		
		System.out.println("main thread");
	}
	
}

}
