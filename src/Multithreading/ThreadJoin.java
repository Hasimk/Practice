package Multithreading;
//join method means child thread first execute after that main thread
public class ThreadJoin extends Thread {
	
	public void run() {
		
		for(int i=0; i<2; i++) {
			
			System.out.println(Thread.currentThread().getName()+"   "+i);
	      try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}	
	}	
	
	public static void main(String [] args) {
		
		ThreadJoin t1= new ThreadJoin();
		ThreadJoin t2= new ThreadJoin();
		t1.start();
		
		
		try {
			t1.join();// main thread is executing this thread
		} catch (InterruptedException e1) {
		
			e1.printStackTrace();
		} 
		
		t2.start();
		
		for(int i=0; i<5; i++) {
			
			System.out.println("Main Thread"+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}

}
