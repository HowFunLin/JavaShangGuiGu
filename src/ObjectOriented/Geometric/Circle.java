package ObjectOriented.Geometric;

class Circle extends GeometricObject
{
	private double radius;
	
	public Circle()
	{
		super();
		this.radius = 1.0;
	}

	public Circle(double radius)
	{
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color, double weight)
	{
		super(color, weight);
		this.radius = radius;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	@Override
	public double findArea()
	{
		return Math.pow(radius, 2) * Math.PI;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Circle c = (Circle) obj;
		if(radius == c.radius) return true;
		else return false;
	}
	
	@Override
	public String toString()
	{
		return String.valueOf(radius);
	}
}
