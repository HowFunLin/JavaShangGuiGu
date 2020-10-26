package ControlFlow;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		System.out.println("All the prime numbers within 100: ");
		
		for(int i = 2; i <= 100; i++)
		{
			int k = 0;
			
			for(int j = 2; j < i; j++) if(i % j == 0) k = 1;
			
			if(k == 0) System.out.print(i + " ");
		}
	}
}
