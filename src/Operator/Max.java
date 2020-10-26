package Operator;

public class Max
{
	public static void main(String[] args)
	{
		int a = 1;
		int b = 2;
		int c = 3;
		
		int max;
		
		// if-else
		if(a > b) max = a;
		else max = b;
		if(c > max) max = c;
		
		System.out.println("Max Number = " + max);
		
		//ÈýÔªÔËËã·û
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		
		System.out.println("Max Number = " + max);
	}
}
