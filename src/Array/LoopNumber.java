package Array;

import java.util.Scanner;

public class LoopNumber
{
	public static void main(String[] args)
	{
		System.out.print("Please enter the number of line: ");
		
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		s.close();
		
		if(l > 20)
		{
			System.out.println("The length must be smaller than 20!");
			System.exit(0);
		}
		
		int[][] loop = new int[l][l];
		int num = 1;
		
		for(int i = 0; i <= l / 2; i++)
		{
			if(loop[i][i] == 0)
			{
				if(i == l - 1 - i) loop[i][i] = num;
				else for(int j = i; j < l - 1 - i; j++)
				{
					loop[i][j] = num;
					num++;
				}
			}
			
			if(loop[i][l - i - 1] == 0)
			{
				for(int j = i; j < l - 1 - i; j++)
				{
					loop[j][l - 1 - i] = num;
					num++;
				}
			}
			
			if(loop[l - i - 1][l - i - 1] == 0)
			{
				for(int j = l - 1 - i; j > i; j--)
				{
					loop[l - i - 1][j] = num;
					num++;
				}
			}
			
			if(loop[l - i - 1][i] == 0)
			{
				for(int j = l - 1 - i; j > i; j--)
				{
					loop[j][i] = num;
					num++;
				}
			}
		}
		
		for(int i = 0; i < l; i++)
		{
			for(int j = 0; j < l; j++) System.out.print(loop[i][j] + "\t");
			System.out.println();
		}
	}
}
