package multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolExample {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service = Executors.newFixedThreadPool(5);
		PrinterThread task = new PrinterThread();
		
		task = new PrinterThread();
		service.submit(task);
		task = new PrinterThread();
		service.submit(task);
		task = new PrinterThread();
		service.submit(task);
		task = new PrinterThread();
		service.submit(task);
		task = new PrinterThread();
		service.submit(task);
		task = new PrinterThread();
		service.submit(task);
		task = new PrinterThread();
		service.submit(task);
		task = new PrinterThread();
		service.submit(task);
		
	}

}
