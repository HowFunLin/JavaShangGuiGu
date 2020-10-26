package ObjectOriented.Circle;

public class Circle
{
	double radius;
	
	Circle()
	{
		this.radius = 1;
	}
	
	void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	double getRadius()
	{
		return radius;
	}
	
	double calculateArea()
	{
		double area = Math.PI * radius * radius;
		return area;
	}
	
	public static void main(String[] args)
	{
		Circle circle = new Circle();
		
		circle.setRadius(2);
		
		System.out.println("The radius of the circle is " + circle.getRadius());
		System.out.println("The area of the circle is " + circle.calculateArea());
	}
}