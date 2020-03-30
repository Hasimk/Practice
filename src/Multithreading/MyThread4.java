package Multithreading;

public class MyThread4 extends Thread {
	
	public void run( ) {
		
		m1();
		m2();
		m3();
		
	}
	
	void m1(){System.out.println("m1 method ");}
	void m2(){System.out.println("m2 method ");}
	void m3(){System.out.println("m3 method ");}

	public static void main(String[] args) {
		
		MyThread4 myThread4 = new MyThread4();
		myThread4.start();
		
		
	}
}

