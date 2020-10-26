package ObjectOriented;

public class SingletonHungry
{
	public static void main(String[] args)
	{
		Hungry h1 = Hungry.getInstance();
		Hungry h2 = Hungry.getInstance();
		
		System.out.println(h1 == h2);
	}
}

class Hungry
{
	private Hungry()
	{
		
	}
	
	private static Hungry hungry = new Hungry();
	
	public static Hungry getInstance()
	{
		return hungry;
	}
}