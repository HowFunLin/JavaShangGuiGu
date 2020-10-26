package Thread.MovieTicket;

class Zhao extends Thread
{
	private int money = 5;
	private TicketSeller ts;
	
	public Zhao(TicketSeller ts)
	{
		this.ts = ts;
	}
	
	@Override
	public void run()
	{
		ts.buy(money);
	}
}
