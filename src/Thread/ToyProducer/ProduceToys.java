package Thread.ToyProducer;

class ProduceToys extends Thread
{
	Producer p;
	
	public ProduceToys(Producer p)
	{
		this.p = p;
	}

	@Override
	public void run()
	{
		p.produceToys();
	}
}