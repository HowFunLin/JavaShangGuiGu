package ObjectOriented.Employee;

class SalariedEmployee extends Employee
{
	private double monthlySalary;
	
	public SalariedEmployee(String name, int number, double monthlySalary, MyDate birthday)
	{
		super(name, number, monthlySalary, birthday);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public void work()
	{
		System.out.println("Salaried employee " + getName() + " is working.");
	}

	@Override
	public double earnings()
	{
		return monthlySalary;
	}
	
	@Override
	public String toString()
	{
		return "Employee type: Monthly \n" + super.toString();
	}
}
