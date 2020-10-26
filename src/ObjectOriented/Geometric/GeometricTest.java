package ObjectOriented.Geometric;

public class GeometricTest
{
	public static void main(String[] args)
	{
		Circle circle1 = new Circle(1, "Blue", 1);
		Circle circle2 = new Circle(1, "Black", 2);
		
		System.out.print("Is the area of two geometric equal? ");
		System.out.println(equalsArea(circle1, circle2));
		displayGeometricObject(circle1);
		
		Rectangle rectangle1 = new Rectangle(1, 2, "Blue", 1);
		Rectangle rectangle2 = new Rectangle(1, 2, "Black", 1);
		
		System.out.print("Is the area of two geometric equal? ");
		System.out.println(equalsArea(rectangle1, rectangle2));
		displayGeometricObject(rectangle1);
		
		Circle circle3 = new Circle(1);
		Circle circle4 = new Circle(1);
		
		System.out.print("Is the color of two circle equal? ");
		System.out.println(circle3.color.equals(circle4.color));
		
		System.out.print("Is the radius of two circle equal? ");
		System.out.println(circle3.equals(circle4));
		
		System.out.println("The radius of circle3 is " + circle3.toString() + ".");
	}
	
	static boolean equalsArea(GeometricObject a, GeometricObject b)
	{
		if(a.findArea() == b.findArea()) return true;
		else return false;
	}
	
	static void displayGeometricObject(GeometricObject g)
	{
		System.out.println("The area of this geometric is " + g.findArea());
	}
}
