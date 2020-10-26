package Array;

import java.util.Arrays;

public class InsertByComparator
{
	public static void main(String[] args)
	{
		int[] i = {1, 3, 6, 8};
		int n = 9;
		Arrays.sort(i);
		insert(i, n);
	}
	
	static void insert(int[] a, int n)
	{
		int pos = 0;
		
		find: for(int i = 0; i < a.length; i++)
		{
			if(n < a[i]) 
			{
				pos = i;
				break find;
			}
		}
		
		if(n > a[0] && pos == 0) pos = a.length;
		
		int[] b = new int[a.length + 1];
		
		for(int i = 0; i <= a.length; i++) 
		{
			if(i < pos) b[i] = a[i];
			else if(i == pos) b[i] = n;
			else b[i] = a[i - 1];
		}
		
		for(int i: b) System.out.print(i);
	}
}
