package multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class AccountManagement {
	
	public static void main(String[] args) throws InterruptedException {
		
		Account account = new Account(5000);
		
		AccountHolder ac1 = new AccountHolder(account);
		ac1.setName("Peter-Thread");
		
		AccountHolder ac2 = new AccountHolder(account);
		ac2.setName("Ross-Thread");
		
		AccountHolder ac3 = new AccountHolder(account);
		ac3.setName("Monica-Thread");
		
		
		AccountHolder ac4 = new AccountHolder(account);
		ac4.setName("Joey-Thread");
		
		AccountHolder ac5 = new AccountHolder(account);
		ac5.setName("Chandler-Thread");
		
		ac1.start();
		ac2.start();
		ac3.start();
		ac4.start();
		ac5.start();
		
		ac1.join();
		ac2.join();
		System.out.println("All transactions done...");
		
		
		
		
	}

}
