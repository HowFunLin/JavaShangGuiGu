package ObjectOriented;

public class SingletonLazy
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
	
	public static Lazy getInstance()
	{
		if(lazy == null) lazy = new Lazy();
		
		return lazy;
	}
}