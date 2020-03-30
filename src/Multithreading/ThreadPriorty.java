package Multithreading;

public class ThreadPriorty extends Thread {

	public void run() {

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());

	}

	public static void main(String[] args) {

		ThreadPriorty t1 = new ThreadPriorty();

		// t1.setPriority(10);
		t1.setPriority(MAX_PRIORITY);

		ThreadPriorty t2 = new ThreadPriorty();
		//t2.setPriority(1);
		t2.setPriority(MIN_PRIORITY);
		
		t1.start();
		t2.start();

	}

}
