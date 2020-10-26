package ObjectOriented;

public class AbstractTest
{
	public static void main(String[] args)
	{
		Abstract test = new Abstract()
		{
			@Override
			public void run()
			{
				System.out.println("Abstract class is running");
			}
		};
		
		test.run();
	}
}

abstract class Abstract
{
	public abstract void run();
}