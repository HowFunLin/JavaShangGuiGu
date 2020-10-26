package Enum;

enum Week
{
	Monday("星期一"), Tuesday("星期二"), Wednesday("星期三"),
	Thursday("星期四"),Friday("星期五"), Saturday("星期六"), Sunday("星期日");
	
	private final String cnWeek;

	private Week(String cnWeek)
	{
		this.cnWeek = cnWeek;
	}

	public String getCnWeek()
	{
		return cnWeek;
	}
}

public class TestWeek
{
	public static void printWeek(Week week)
	{
		System.out.println(week.getCnWeek());
	}
	
	public static void main(String[] args)
	{
		int i = 0;
		
		try
		{
			i = Integer.parseInt(args[0]);
		} catch (NumberFormatException e)
		{
			System.out.println("Please enter correct number.");
			System.exit(0);
		}
		
		switch(i)
		{
			case 1:
				System.out.println(Week.Monday);
				printWeek(Week.Monday);
				break;
			case 2:
				System.out.println(Week.Tuesday);
				printWeek(Week.Tuesday);
				break;
			case 3:
				System.out.println(Week.Wednesday);
				printWeek(Week.Wednesday);
				break;
			case 4:
				System.out.println(Week.Thursday);
				printWeek(Week.Thursday);
				break;
			case 5:
				System.out.println(Week.Friday);
				printWeek(Week.Friday);
				break;
			case 6:
				System.out.println(Week.Saturday);
				printWeek(Week.Saturday);
				break;
			case 7:
				System.out.println(Week.Sunday);
				printWeek(Week.Sunday);
				break;
			default:
				System.out.println("Please enter correct number.");
				break;
		}
	}
}