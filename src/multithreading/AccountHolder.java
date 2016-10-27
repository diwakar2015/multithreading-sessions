package multithreading;

public class AccountHolder extends Thread{
	
	private Account account;
	
	public AccountHolder(Account account)
	{
		this.account = account;
		
	}
	
	@Override
	public void run()
	{
		try {
			account.withdraw(100);
		} catch (InsufficientBalanceException e) {
			System.out.println("Exception caught : "+ e.getMessage());
		}
		
	}
	
	

}
