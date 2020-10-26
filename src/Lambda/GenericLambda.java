package Lambda;

interface Calculate<T, R>
{
	public R getValue(T x, T y);
}

public class GenericLambda
{
	static long calculate(long x, long y, Calculate<Long, Long> c)
	{
		return c.getValue(x, y);
	}
	
	public static void main(String[] args)
	{
		long result = calculate(1L, 2L, (x, y) -> (x + y));
		System.out.println(result);
		
		result = calculate(1L, 2L, (x, y) -> (x * y));
		System.out.println(result);
	}
}
