package multithreading.prod_cons;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerExample {
	private static final int MAX_SIZE = 20;
	public static void main(String[] args) {
		
		List<String> msgQueue = new ArrayList<>();
		
		Producer prodThread = new Producer(msgQueue, MAX_SIZE);
		Thread pT = new Thread(prodThread, "Producer-Thread");
		
		Consumer conThread = new Consumer(msgQueue);
		Thread cT = new Thread(conThread, "Consumer-Thread");
		
		pT.start();
		cT.start();
		
		
		
	}

}
