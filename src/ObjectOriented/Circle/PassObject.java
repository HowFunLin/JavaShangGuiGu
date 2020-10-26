package ObjectOriented.Circle;

public class PassObject
{
	public static void main(String[] args)
	{
		PassObject test = new PassObject();
		Circle c = new Circle();
		
		test.printAreas(c, 4);
	}
	
	public void printAreas(Circle c, int time)
	{
		System.out.println("Radius" + "\t" + "Area");
		
		for(int i = 1; i <= time; i++)
		{
			c.radius = i;
			System.out.println(c.radius + " \t" +c.calculateArea());
		}
	}
}