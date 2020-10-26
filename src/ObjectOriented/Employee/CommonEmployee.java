package ObjectOriented.Employee;

public class CommonEmployee extends Employee
{
	public CommonEmployee(String name, int number, double salary, MyDate birthday)
	{
		super(name, number, salary, birthday);
	}

	@Override
	public void work()
	{
		System.out.println("Common employee " + getName() + " is working.");
	}

	@Override
	public double earnings()
	{
		return getSalary();
	}
}
