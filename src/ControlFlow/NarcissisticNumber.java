package ControlFlow;

public class NarcissisticNumber
{
	public static void main(String[] args)
	{
		System.out.println("All the narcissistic number: ");
		
		for(int i = 100; i <= 999; i++)
		{
			int single = i % 10;
			int tens = i % 100 / 10;
			int hundreds = i / 100;
			
			if(i == (int)Math.pow(single, 3) + (int)Math.pow(tens, 3) + (int)Math.pow(hundreds, 3))
				System.out.print(i + " ");
		}
	}
}
