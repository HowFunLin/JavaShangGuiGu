package ObjectOriented.Employee;

public class Manager extends Employee
{
	double bonus;

	public Manager(String name, int number, double salary, double bonus, MyDate birthday)
	{
		super(name, number, salary, birthday);
		this.bonus = bonus;
	}

	@Override
	public void work()
	{
		System.out.println("Manager " + getName() + " is working.");
	}

	@Override
	public double earnings()
	{
		return getSalary();
	}
}
