package Multithreading;

public class MyRunnableAnonums {
	
	public static void main(String[] args) {
		
		Runnable r1= new Runnable() {
			public void run() {
				System.out.println("First Thread");
								
			}
		};
		
		Runnable r2= new Runnable() {
			public void run() {
				System.out.println("second Thread");
						
			}
	};
	
	Thread t1= new Thread(r1);
	t1.start();
	Thread t2= new Thread(r2);
	t2.start();
	
	
	}

}
