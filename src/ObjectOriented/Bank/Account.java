package ObjectOriented.Bank;

class Account
{
	private int id = 1000;
	protected double balance;
	private double annualInterestRate;
	
	private int password;
	
	private static double interestRate;
	private static double minBalance;
	
	public Account(double init_balance)
	{
		this.balance = init_balance;
	}

	public Account(double balance, int password)
	{
		this.id++;
		this.balance = balance;
		this.password = password;
	}

	public Account(int id, double balance, double annualInterestRate)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public static double getInterestRate()
	{
		return interestRate;
	}

	public static void setInterestRate(double interestRate)
	{
		Account.interestRate = interestRate;
	}

	public static double getMinBalance()
	{
		return minBalance;
	}

	public static void setMinBalance(double minBalance)
	{
		Account.minBalance = minBalance;
	}

	public int getPassword()
	{
		return password;
	}

	public void setPassword(int password)
	{
		this.password = password;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterest()
	{
		return annualInterestRate / 12;
	}
	
	public void withdraw(double amount)
	{
		if(this.balance >= amount) 
		{
			this.balance -= amount;
			System.out.println("Withdraw money $" + amount + " successfully!");
		}
		else System.out.println("The account balance is not enough!");
	}
	
	public void deposit(double amount)
	{
		this.balance += amount;
		System.out.println("Deposit money $" + amount + " successfully!");
	}
}