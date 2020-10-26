package ObjectOriented.Bank;

public class CheckAccountTest
{
	public static void main(String[] args)
	{
		Account account = new CheckAccount(1122, 20000, 0.045, 5000);
		
		account.withdraw(5000);
		account.withdraw(18000);
		account.withdraw(3000);
	}
}
