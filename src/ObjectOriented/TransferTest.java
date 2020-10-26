package ObjectOriented;

class Value
{
	int i = 15;
}

public class TransferTest
{
	public static void main(String[] args)
	{
		TransferTest test = new TransferTest();
		test.first();
	}
	
	public void first()
	{
		int i = 5;
		Value v = new Value();
		v.i = 15;
		second(v, i);
		System.out.println(v.i);
	}
	
	public void second(Value v, int i)
	{
		i = 0;
		v.i = 20;
		Value val = new Value();
		v = val;
		System.out.println(v.i + " " + i);
	}
}
