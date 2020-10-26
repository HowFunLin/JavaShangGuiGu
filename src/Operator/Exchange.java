package Operator;

public class Exchange
{
	public static void main(String[] args)
	{
		String s1 = "a";
		String s2 = "b";
		
		String temp = s1;
		s1 = s2;
		s2 = temp;
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
