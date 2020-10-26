package Thread.MyThread;

public class TestThread
{
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread("One");
		MyThread t2 = new MyThread("Two");
		MyThread t3 = new MyThread("Three");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
