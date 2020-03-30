package Multithreading;

public class DeamonThread extends Thread{
	
	public void run () {
		
		for(int i=0; i<10; i++) {
		
		System.out.println("Deamon Thread");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}}

	public static void main(String[] args) {
		
		DeamonThread t1= new DeamonThread();
		
		t1.setDaemon(true);
		t1.start();
		
		for (int i = 0; i<2; i++) {
			
			System.out.println("main thread");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
								e.printStackTrace();
			}
			
		}
		
	}
}
