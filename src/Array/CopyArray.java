package Array;

public class CopyArray
{
	public static void main(String[] args)
	{
		int[] arr = new int[] {34, 5, 22, -98, 6, 76, 0, -3};
		int[] arrCopy = new int[arr.length];
		
		for(int i = 0; i < arrCopy.length; i++) arrCopy[i] = arr[i];
		
		for(int i: arrCopy) System.out.print(i + " ");
	}
}