package ObjectOriented.Circle;

public class Cylinder extends Circle
{
	private double length;
	
	Cylinder()
	{
		this.length = 1;
	}

	double getLength()
	{
		return length;
	}

	void setLength(double length)
	{
		this.length = length;
	}
	
	double calculateVolume()
	{
		double volume = super.calculateArea() * length;
		return volume;
	}
	
	@Override
	double calculateArea()
	{
		double surfaceArea = 2 * super.calculateArea() + Math.PI * getRadius() * 2;
		return surfaceArea;
	}
	
	public static void main(String[] args)
	{
		Cylinder cylinder = new Cylinder();
		
		cylinder.setRadius(2);
		cylinder.setLength(2);
		
		System.out.println("The radius of the cylinder is " + cylinder.getRadius());
		System.out.println("The length of the cylinder is " + cylinder.getLength());
		System.out.println("The volume of the cylinder is " + cylinder.calculateVolume());
		System.out.println("The area of the cylinder is " + cylinder.calculateArea());
	}
}
