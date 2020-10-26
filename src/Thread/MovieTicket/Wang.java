package Thread.MovieTicket;

class Wang extends Thread
{
	private int money = 20;
	private TicketSeller ts;
	
	public Wang(TicketSeller ts)
	{
		this.ts = ts;
	}
	
	@Override
	public void run()
	{
		ts.buy(money);
	}
}
