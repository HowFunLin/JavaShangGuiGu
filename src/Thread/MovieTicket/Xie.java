package Thread.MovieTicket;

class Xie extends Thread
{
	private int money = 10;
	private TicketSeller ts;
	
	public Xie(TicketSeller ts)
	{
		this.ts = ts;
	}
	
	@Override
	public void run()
	{
		ts.buy(money);
	}
}
