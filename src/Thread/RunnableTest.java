package Thread;

public class RunnableTest
{
	public static void main(String[] args)
	{
		Runnable r = new RunnableClass();
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

class RunnableClass implements Runnable
{
	@Override
	public void run()
	{
		for(int i = 0; i < 100; i++) System.out.println(i);
	}
}