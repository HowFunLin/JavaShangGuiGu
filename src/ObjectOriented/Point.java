package ObjectOriented;

public class Point
{
	private double x;
	private double y;
	
	public Point()
	{
		this.x = 0;
		this.y = 0;
	}

	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double getDistanceFromOrigin()
	{
		return Math.hypot(x, y);
	}
	
	public double getDistanceFromSpecifiedPoint(double x, double y)
	{
		double xsqr = this.x * this.x - x * x;
		double ysqr = this.y * this.y - y * y;
		
		return Math.sqrt(Math.abs(xsqr) + Math.abs(ysqr));
	}
	
	public double getDistanceFromSpecifiedPoint(Point p)
	{
		double xsqr = this.x * this.x - p.x * p.x;
		double ysqr = this.y * this.y - p.y * p.y;
		
		return Math.sqrt(Math.abs(xsqr) + Math.abs(ysqr));
	}
	
	public void showPoint()
	{
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
}
