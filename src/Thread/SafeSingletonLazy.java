package Thread;

public class SafeSingletonLazy
{
	public static void main(String[] args)
	{
		Lazy l1 = Lazy.getInstance();
		Lazy l2 = Lazy.getInstance();
		
		System.out.println(l1 == l2);
	}
}

class Lazy
{
	private Lazy()
	{
		
	}
	
	private static Lazy lazy = null;
	
	//双重检查提高线程效率，无需每次执行均进入同步代码块
	public static Lazy getInstance()
	{
		if(lazy == null)
		{
			synchronized(Lazy.class)
			{
				if(lazy == null) lazy = new Lazy();
			}
		}
		return lazy;
	}
	
	
	//public static Lazy getInstance()
	//{
	//	if(lazy == null) lazy = new Lazy();
		
	//	return lazy;
	//}
}