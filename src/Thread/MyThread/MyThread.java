package Thread.MyThread;

class MyThread extends Thread
{
	private String whoAmI;
	private int delay;
	
	public MyThread(String whoAmI)
	{
		this.whoAmI = whoAmI;
		this.delay = (int) (Math.random() * 1000);
	}
	
	@Override
	public void run()
	{
		try
		{
			sleep(this.delay);
		} 
		catch (InterruptedException e){}
		
		System.out.println("Thread name is " + whoAmI + ", slept " + delay + " milliseconds.");
	}
}
