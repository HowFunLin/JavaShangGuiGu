package ObjectOriented.CompareObject;

class ComparableCircle extends Circle implements CompareObject
{
	public ComparableCircle(double radius)
	{
		super(radius);
	}

	@Override
	public int compareTo(Object o)
	{
		if (this == o) return 0;
		
		//if(o instanceof ComparableCircle)
		//{
			Circle c = (ComparableCircle) o;
		
			if(getRadius() == c.getRadius()) return 0;
			else if(getRadius() > c.getRadius()) return 1;
			else return -1;
		//}
	}
}
