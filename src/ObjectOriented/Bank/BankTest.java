package ObjectOriented.Bank;

public class BankTest
{
	public static void main(String[] args)
	{
		Bank bank = new Bank();
		
		bank.addCustomer("Jane", "Smith");
		
		bank.getCustomers(0).setAccount(new Account(2000));
		
		bank.getCustomers(0).getAccount().withdraw(500);
		
		double balance = bank.getCustomers(0).getAccount().getBalance();
		System.out.println("Customer: " + bank.getCustomers(0).getFirstName() + "'s account balance: $" + balance);
		
		bank.addCustomer("Riyad", "Mahrez");
		System.out.println("Number of customers is " + bank.getNumberOfCustomer() + ".");
	}
}