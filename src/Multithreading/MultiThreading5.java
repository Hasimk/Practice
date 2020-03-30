package Multithreading;

public class MultiThreading5 extends Thread {
	
	public void run()
	{
		
		}	
	public static void main(String[] args) {
		
		MultiThreading5 t1 = new MultiThreading5();
			 t1.start();

			 MultiThreading5 t2 = new MultiThreading5();
			 
			 System.out.println(t1.getName());
			 System.out.println(t2.getName());
			 t1.setName("ram");
			 System.out.println(t1.getName());
			 System.out.println(Thread.currentThread().getName());
			 System.out.println(Thread.activeCount());
			 System.out.println(t1.isAlive());
			 
			 
		
	}

}
