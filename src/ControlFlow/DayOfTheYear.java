package ControlFlow;

import java.util.Scanner;

public class DayOfTheYear
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the year: ");
		int year = scan.nextInt();
		
		System.out.print("Please enter the month: ");
		int month = scan.nextInt();
		
		System.out.print("Please enter the day: ");
		int day = scan.nextInt();
		
		scan.close();
		
		int result = 0;
		int feb;
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) feb = 29;
		else feb = 28;
			
		for(int i = 1; i < month; i++)
		{
			switch(i)
			{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					result += 31;
					break;
					
				case 2:
					result += feb;
					break;
					
				case 4:
				case 6:
				case 9:
				case 11:
					result += 30;
					break;
			}
		}
		
		result += day;
		
		System.out.println("This day is the " + result + " day of the " + year + ".");
	}
}
