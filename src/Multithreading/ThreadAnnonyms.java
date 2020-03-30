package Multithreading;

public class ThreadAnnonyms {
	
	public static void main(String[] args) {
		
		Thread t= new Thread() {
			
			public void run () {
				
				System.out.println("First Thread");
			}
		};// semicolon is mandatory
		
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Second Thread");
			}
			
		};
		
		t.start();
		t1.start();
	}

}
