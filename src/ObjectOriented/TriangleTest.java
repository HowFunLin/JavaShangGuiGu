package ObjectOriented;

public class TriangleTest
{
	public static void main(String[] args)
	{
		Triangle t = new Triangle(3, 3);
		t.calculateArea();
	}
}

class Triangle
{
	private double base;
	private double height;
	
	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	
	public void calculateArea()
	{
		System.out.println("The area of triangle is " + (base * height / 2) + ".");
	}
}