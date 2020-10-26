package ObjectOriented.Employee;

public class EmployeTest
{
	public static void main(String[] args)
	{
		Manager m = new Manager("John", 4684, 30000, 30000, new MyDate(1985, 06, 21));
		m.work();
		
		CommonEmployee  ce = new CommonEmployee("Tommy", 1000, 15000, new MyDate(1995, 07, 26));
		ce.work();
	}
}
