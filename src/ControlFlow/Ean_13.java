package ControlFlow;

public class Ean_13
{
	public static void main(String[] args)
	{
		int[] t = new int[13];
		
		for(int i = 0; i < 12; i++) t[i] = (int) (Math.random() * 10);
		
		int odd = 0;
		
		for(int i = 0; i < 11; i = i + 2) odd += t[i];
		
		int even = 0;
		
		for(int i = 1; i < 12; i = i + 2) even += t[i];
		
		int check = 10 - ((odd + 3 * even) % 10);
		
		if(check == 10) check = 0;
		
		t[12] = check;
		
		for(int i: t) System.out.print(i);
	}
}
