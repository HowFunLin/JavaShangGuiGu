package ObjectOriented.Employee;

import java.util.Scanner;

public class PayrpollSystem
{	
	public static void main(String[] args)
	{
		Employee[] e = new Employee[2];
		
		e[0] = new SalariedEmployee("John", 0, 20000, new MyDate(2000, 12, 21));
		e[1] = new HourlyEmployee("Jack", 1, 100, 8, new MyDate(2000, 06, 21));
		
		System.out.print("Please enter which is this month: ");
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		s.close();
		System.out.println();
		
		for(Employee em: e) 
		{
			System.out.println(em.toString());
			if(em.getBirthday().getMonth() == month)
			{
				if(em instanceof SalariedEmployee)System.out.println(em.getName() +  "'s salary of this month is " + (em.earnings() + 100) + "\n");
				else System.out.println(em.getName() +  "'s salary of this month is " + (em.earnings() * 31 + 100) + "\n");
			}
			else 
			{
				if(em instanceof SalariedEmployee)System.out.println(em.getName() +  "'s salary of this month is " + em.earnings() + "\n");
				else System.out.println(em.getName() +  "'s salary of this month is " + (em.earnings() * 31) + "\n");
			}
		}
	}
}
