package ObjectOriented.Employee;

public class MyDate
{
	private int year;
	private int month;
	private int day;
	
	public MyDate(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getMonth()
	{
		return month;
	}

	public String toDateString()
	{
		return year + "." + month + "." + day;
	}
}
