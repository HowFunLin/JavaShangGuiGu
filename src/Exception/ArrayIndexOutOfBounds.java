package Exception;

public class ArrayIndexOutOfBounds
{
	public static void main(String[] args)
	{
		int[] a = new int[5];
		
		try
		{
			for(int i = 0; i <= a.length; i++)
			{
				a[i] = 1;
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{

		}
		finally
		{
			System.out.println("Program is not interrupted.");
		}
		
		for(int i: a) System.out.print(i);
	}
}
