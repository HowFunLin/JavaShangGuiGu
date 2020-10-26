package Thread.ToyProducer;

public class ProducingTest
{
	public static void main(String[] args)
	{
		Producer p = new Producer();
		
		ProduceToys pt = new ProduceToys(p);
		EatSteamedBuns esb = new EatSteamedBuns(p);
		
		pt.start();
		esb.start();
	}
}
