package Thread;

public class ThreadTest
{
	public static void main(String[] args)
	{
		ThreadClass t1 = new ThreadClass();
		ThreadClass t2 = new ThreadClass();
		
		t1.start();
		t2.start();
	}
}

class ThreadClass extends Thread
{
	@Override
	public void run()
	{
		for(int i = 0; i < 100; i++) System.out.println(i);
	}
}
