package Thread.MovieTicket;

class TicketLobby
{
	public static void main(String[] args)
	{
		TicketSeller ts = new TicketSeller();
		
		Wang w = new Wang(ts);
		Xie x = new Xie(ts);
		Zhao z = new Zhao(ts);

		w.start();
		x.start();
		z.start();
	}
}