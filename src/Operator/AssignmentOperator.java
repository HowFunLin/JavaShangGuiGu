package Operator;

public class AssignmentOperator
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		short s = 3;
		//Cast Required
		//s = s + 2;
		s += 2;
		
		int n = 10;
		n += (n++) + (++n); //10+10+12
		System.out.println(n);
	}
}
