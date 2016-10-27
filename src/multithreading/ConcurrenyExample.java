package multithreading;

public class ConcurrenyExample {
	
	public static void main(String[] args) {
		
		Runnable t1 = new PrinterThread();
		Runnable t2 = new PrinterThread();
		Runnable t3 = new PrinterThread();
		Thread thread = new Thread(t1, "T0");
		Thread thread1 = new Thread(t1, "T1");
		Thread thread2 = new Thread(t1, "T2");
		thread.start();
		thread1.start();
		thread2.start();
		
	}
	
	
		
	}
	
	
