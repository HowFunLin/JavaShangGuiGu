package Thread.Shop;

public class ShopTest
{
	public static void main(String[] args)
	{
		Clerk c = new Clerk();
		
		Productor p = new Productor(c);
		Consumer u = new Consumer(c);
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(u);
		
		t1.start();
		t2.start();
	}
}
