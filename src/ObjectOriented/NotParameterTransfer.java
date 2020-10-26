package ObjectOriented;

import java.io.PrintStream;

public class NotParameterTransfer
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 10;
		method(a ,b);//��Ҫ��method����������֮�����ӡ��a = 100, b = 200
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	/*
	static void method(int a, int b)
	{
		a = a * 10;
		b = b * 20;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);	
		System.exit(0);
	}
	 */
	
	//������дprintln����
	static void method(int a, int b)
	{
		PrintStream ps = new PrintStream(System.out) 
		{
			@Override
			public void println(String x)
			{
				if("a = 10".equals(x)) x = "a = 100";
				else if("b = 10".equals(x)) x = "b = 200";
				super.println(x);
			}
		};
		
		System.setOut(ps);
	}
}
