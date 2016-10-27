package multithreading;

public class Account {
	
	private int balance;
	
	public Account(int initialBalance)
	{
		this.balance = initialBalance;
	}
	
	public synchronized void withdraw(int amount) throws InsufficientBalanceException
	{
			
		int diff = this.balance - amount;
		
		if(diff >= 0)
		{
			this.balance = this.balance - amount;
			System.out.println("Amount withdrawn : "+ amount 
					+ " Current Bal : "+ this.balance
					+ " By "+ Thread.currentThread().getName());
		}
		else
		{
			throw new InsufficientBalanceException("Balance can not be negative!");
		}
		
		
		
	}
	

}
