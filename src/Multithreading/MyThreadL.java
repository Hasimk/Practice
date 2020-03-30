package Multithreading;

   class Abc1 extends Thread{
	
	public void run() {
		
		System.out.println("hi----1");
	}
   }
	
	class Abc2 extends Thread{
		public void run() {
			
			System.out.println("hi----2");
		}
		
	}
	
	class Abc3 extends Thread{
		public void run() {
			
			System.out.println("hi----3");
		}
		
	}
	
public class MyThreadL
{
	public static void main(String[] args)
	{
		 Abc1 t1= new Abc1();
		 t1.start();
		 Abc2 t2 = new Abc2();
		 t2.start();
		 Abc3 t3 = new Abc3();
		 t3.start();
		 
	}
}