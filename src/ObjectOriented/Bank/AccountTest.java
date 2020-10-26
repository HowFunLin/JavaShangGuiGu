package ObjectOriented.Bank;

public class AccountTest
{
	public static void main(String[] args)
	{
		Account account = new Account(10000, 123456);
		
		Account.setInterestRate(0.043);
		Account.setMinBalance(10);
		
		System.out.println("The acount id is " + account.getId() +
				", password is " + account.getPassword() +
				", balance is $" + account.getBalance() + 
				", InterestRate is " + Account.getInterestRate() * 100 +
				"%, Minimun Balance is $" + Account.getMinBalance() + ".");
	}
}
