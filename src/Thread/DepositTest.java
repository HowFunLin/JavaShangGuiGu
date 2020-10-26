package Thread;

public class DepositTest
{
	public static void main(String[] args)
	{
		Account a = new Account();
		Customer c = new Customer(a);
		
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		
		t1.setName("John");
		t2.setName("Riyad");
		
		t1.start();
		t2.start();
	}
}

class Account
{
	private double balance;
	
	public Account()
	{
		balance = 0;
	}
	
	public synchronized void deposit()
	{
		balance += 1000;
		try
		{
			Thread.sleep(500);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " deposited money $1000. \n" + 
		"The balance is " + balance);
	}
	
}

class Customer implements Runnable
{
	Account account;
	
	public Customer(Account a)
	{
		account = a;
	}
	
	@Override
	public void run()
	{
		for(int i = 0; i < 3; i++) account.deposit();
	}
}