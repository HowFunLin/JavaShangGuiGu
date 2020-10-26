package ObjectOriented.Bank;

class Bank
{
	Customer[] customer;
	int numberOfCustomer;
	
	public Bank()
	{
		this.customer = new Customer[10];
		this.numberOfCustomer = 0;
	}
	
	public void addCustomer(String f, String l)
	{
		Customer c = new Customer(f, l);
		customer[numberOfCustomer++] = c;
	}

	public int getNumberOfCustomer()
	{
		return numberOfCustomer;
	}
	
	public Customer getCustomers(int index)
	{
		return customer[index];	
	}
}