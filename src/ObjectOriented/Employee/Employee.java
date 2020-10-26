package ObjectOriented.Employee;

public abstract class Employee
{
	private String name;
	private int number;
	private double salary;
	
	private MyDate birthday;
	
	public Employee(String name, int number, double salary, MyDate birthday)
	{
		this.setName(name);
		this.number = number;
		this.setSalary(salary);
		this.birthday = birthday;
	}
	
	public int getNumber()
	{
		return number;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}

	public MyDate getBirthday()
	{
		return birthday;
	}

	public void setBirthday(MyDate birthday)
	{
		this.birthday = birthday;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public abstract void work();
	public abstract double earnings();
	
	@Override
	public String toString()
	{
		return "Name: " + name + "\n" +
			"Number: " + number + "\n" + 
			"Birthday: " + birthday.toDateString();
	}
}
