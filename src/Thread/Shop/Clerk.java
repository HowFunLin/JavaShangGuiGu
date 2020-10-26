package Thread.Shop;

class Clerk
{
	private int goodsNumber = 0;
	
	public synchronized void produce()
	{	
		if(goodsNumber >= 20)
		{
			try
			{
				wait();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		else 
		{
			System.out.println("Producing goods" + ++goodsNumber);
			notify();
		}
	}
	
	public synchronized void consume()
	{
		if(goodsNumber <= 0)
		{
			try
			{
				wait();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		else 
		{
			System.out.println("The consumer takes goods" + goodsNumber--);
			notify();
		}
	}
}
