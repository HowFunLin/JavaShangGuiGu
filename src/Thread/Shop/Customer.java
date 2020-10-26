package Thread.Shop;

class Consumer implements Runnable
{
	private Clerk clerk;
	
	public Consumer(Clerk c)
	{
		clerk = c;
	}
	
	@Override
	public void run()
	{
		while(true) 
		{
			try
			{
				Thread.sleep(500);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			clerk.consume();
		}
	}
}