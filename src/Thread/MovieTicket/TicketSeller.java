package Thread.MovieTicket;

class TicketSeller
{
	private int five = 1;
	private int ten = 0;
	private int twenty = 0;
	
	public synchronized void buy(int receiveMoney)
	{
		if(receiveMoney == 5)
		{
			System.out.println("Zhao Si has bought the ticket.");
			five++;
		}
		else if(receiveMoney == 10)
		{
			while(five < 1)
			{
				try
				{
					wait();
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
			System.out.println("Xie Dajiao has bought the ticket.");
			five--;
			ten++;
		}
		else
		{
			while(ten < 1 || five < 1)
			{
				try
				{
					wait();
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
			System.out.println("Wang Dana has bought the ticket.");
			twenty++;
			five--;
			ten--;
		}
		notifyAll();
	}
}
