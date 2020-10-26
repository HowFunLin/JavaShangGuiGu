package ObjectOriented;

class Car
{
	String color = "Red";
	int num = 4;
	
	@SuppressWarnings("unused")
	void show()
	{
		int a = 10;
		System.out.println("Color = " + color + ", Number = " + num);
	}
}

public class CarTest
{
	public static void main(String[] args)
	{
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.color = "Blue";
		
		c1.show();
		c2.show();
	}
}
