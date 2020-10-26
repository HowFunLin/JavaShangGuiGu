package ControlFlow;

public class If_Else
{
	public static void main(String[] args)
	{
		//Test1
		int x = 4;
		int y = 1;
		
		if(x > 2)
			if(y > 2)
				System.out.println(x + y);
		else
			System.out.println("x is " + x);
		
		//Test2
		boolean b = true;
		
		if(b = false) System.out.println("a");
		else if(b) System.out.println("b");
		else if(!b) System.out.println("c"); //out
		else System.out.println("d");
	}
}
