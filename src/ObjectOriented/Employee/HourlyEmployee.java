package ObjectOriented.Employee;

class HourlyEmployee extends Employee
{
	private double wage;
	private double hour;
	
	public HourlyEmployee(String name, int number, double wage, double hour, MyDate birthday)
	{
		super(name, number, wage, birthday);
		this.wage = wage;
		this.hour = hour;
	}

	@Override
	public void work()
	{
		System.out.println("Hourly employee " + getName() + " is working.");		
	}

	@Override
	public double earnings()
	{
		return wage * hour;
	}
	
	@Override
	public String toString()
	{
		return "Employee type: Hourly \n" + super.toString();
	}
}
