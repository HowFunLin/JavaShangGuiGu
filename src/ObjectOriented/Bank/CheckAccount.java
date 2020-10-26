package ObjectOriented.Bank;

class CheckAccount extends Account
{
	double overdraft;
	
	public CheckAccount(int id, double balance, double annualInterestRate, double overdraft)
	{
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}
	
	@Override
	public void withdraw(double amount)
	{
		if(balance >= amount) 
		{
			balance -= amount;
			System.out.println("Withdraw money $" + amount + " successfully!");
			System.out.println("Now your balance is $" + balance + ".");
			System.out.println("Your overdraft remains $" + overdraft + ".");
			System.out.println();
		}
		
		if(amount > balance)
		{
			double line = amount - balance;
			
			if(line <= overdraft)
			{
				balance = 0;
				overdraft -= line;
				System.out.println("Withdraw money $" + amount + " successfully!");
				System.out.println("You have overdrawn your account by $" + line + "!");
				System.out.println("Now your balance is $" + balance + ".");
				System.out.println("Your overdraft remains $" + overdraft + ".");
				System.out.println();
			}
			else
			{
				System.out.println("Withdraw money $" + amount + " fail!");
				System.out.println("The account overdraft is not enough!");
				System.out.println("Now your balance is $" + balance + ".");
				System.out.println("Your overdraft remains $" + overdraft + ".");
				System.out.println();
			}
		}
	}
}
