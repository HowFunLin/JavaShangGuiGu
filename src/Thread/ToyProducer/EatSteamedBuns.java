package Thread.ToyProducer;

class EatSteamedBuns extends Thread
{
	Producer p;
	
	public EatSteamedBuns(Producer p)
	{
		this.p = p;
	}

	@Override
	public void run()
	{
		p.eatSteamedBuns();
	}
}
