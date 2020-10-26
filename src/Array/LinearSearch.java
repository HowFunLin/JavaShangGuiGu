package Array;

public class LinearSearch
{
	public static void main(String[] args)
	{
		int[] arr = new int[] {34, 5, 22, -98, 6, 76, 0, -3};
		int index = -1;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == 22) 
			{
				index = i;
				System.out.println("The index is " + index);
			}
			if(i == arr.length - 1 && index == -1) System.out.println("The element is not in the array.");
		}
	}
}