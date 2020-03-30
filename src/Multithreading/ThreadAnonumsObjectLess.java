package Multithreading;

public class ThreadAnonumsObjectLess {
	
public static void main(String[] args) {
		
		 new Thread() {
			
			public void run () {
				
				System.out.println("First Thread");
			}
		}.start();;
		
		
		
	}

}



