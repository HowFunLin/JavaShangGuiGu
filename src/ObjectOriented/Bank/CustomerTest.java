package ObjectOriented.Bank;

public class CustomerTest
{
	public static void main(String[] args)
	{
		Customer js = new Customer("Jane", "Smith");
		Account jsa = new Account(1000, 2000, 0.0123);
		
		js.setAccount(jsa);
		
		jsa.deposit(100);
		jsa.withdraw(960);
		jsa.withdraw(2000);
		
		System.out.println("Customer [" + js.getLastName() + ", " + 
		js.getFirstName() + "] has a account: id is " + jsa.getId() + 
		", annualInterestRate is " + jsa.getAnnualInterestRate() * 100 + 
		"%, balance is " + jsa.getBalance());
	}
}