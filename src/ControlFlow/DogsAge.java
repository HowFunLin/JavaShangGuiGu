package ControlFlow;

import java.util.Scanner;

public class DogsAge
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter dog's age: ");
		int age = scan.nextInt();
		double humanAge;
		
		if(age < 0) System.out.println("Dog isn't even born yet!");
		else
		{
			if(age <= 2) humanAge = 10.5 * age;
			else 
			{
				humanAge = 21 + (age - 2) * 4;
				System.out.println("Dog's age " + age + " is equivalent to human's age " + (int)humanAge + ".");
			}
		}
		
		scan.close();
	}
}
