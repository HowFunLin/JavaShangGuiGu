package Operator;

public class PlusOrMultiply
{
	public static void main(String[] args)
	{
		double a = 10.1;
		double b = 19.9;
		
		if((a > 10.0) && (b < 20.0)) System.out.println("Result: " + (a + b));
		else System.out.println("Result: " + (a * b));
	}
}
