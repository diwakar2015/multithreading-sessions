package multithreading;

public class PrinterThread implements Runnable{

	@Override
	public void run() {
		
		for(int i=1; i<=5; i++)
			System.out.println("Value : "+ i + " by Thread : "+ Thread.currentThread().getName());
		
		System.out.println(Thread.currentThread().getName() + " has finished!!");
	}

}
