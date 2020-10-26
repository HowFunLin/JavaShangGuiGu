package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ListTest
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++)
		{
			Integer integer = scanner.nextInt();
			list.add(integer);
		}
		scanner.close();
		
		Collections.reverse(list);
		for(Integer i: list) System.out.print(i + " ");
		
		System.out.println();
		
		Comparator<Integer> comparator = Collections.reverseOrder();
		Collections.sort(list, comparator);
		for(Integer i: list) System.out.print(i + " ");
	}
}
