package ObjectOriented;

public class Interview
{
	public static void main(String[] args)
	{
		Base base = new Sub();
		base.add(1, 2, 3);
		
		Sub sub = (Sub)base;
		sub.add(1, 2, 3);
	}
}

class Base
{
	public void add(int a, int... arr)
	{
		System.out.println("Base");
	}
}

class Sub extends Base
{
	//可以认为是对add方法的重写，但不建议
	//public void add(int a, int[] arr)
	//{
	//	System.err.println("Sub_1");
	//}
	
	//形参已确定的方法优先调用
	public void add(int a, int b, int c)
	{
		System.out.println("Sub_2");
	}
}