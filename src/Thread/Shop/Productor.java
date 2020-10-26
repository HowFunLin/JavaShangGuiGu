package Thread.Shop;

class Productor implements Runnable
{
	private Clerk clerk;
	
	public Productor(Clerk c)
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
			clerk.produce();
		}
	}
}
