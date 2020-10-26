package Operator;

public class StringOperator
{
	public static void main(String[] args)
	{
		//Test1
		char c = 'a';
		int num = 10;
		String str = "hello";
		
		System.out.println(c + num + str);
		System.out.println(c + str + num);
		System.out.println(c + (num + str));
		System.out.println((c + num) + str);
		System.out.println(str + num + c);
		
		//Test2
		//*	*
		System.out.println("*	*");
		System.out.println('*' + '\t' + '*');
		System.out.println('*' + "\t" + '*');
		System.out.println('*' + '\t' + "*");
		System.out.println('*' + ('\t' + "*"));
	}
}
