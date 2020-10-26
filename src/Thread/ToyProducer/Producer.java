package Thread.ToyProducer;

class Producer
{
	int toyNumber = 0;
	int eatenSteamedBunNumber = 0;
	
	public synchronized void produceToys()
	{
		while(toyNumber < 50)
		{
			try
			{
				Thread.sleep(200);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			toyNumber++;
			System.out.println("Produced No." + toyNumber + " toy.");
			
			if(toyNumber == 20) 
			{
				try
				{
					wait();
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public synchronized void eatSteamedBuns()
	{	
		while(toyNumber == 20)
		{
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			eatenSteamedBunNumber++;
			System.out.println("Ate No." + eatenSteamedBunNumber + " steamed bun.");
			
			if(eatenSteamedBunNumber == 3) 
			{
				notify();
				break;
			}
		}
	}
}
